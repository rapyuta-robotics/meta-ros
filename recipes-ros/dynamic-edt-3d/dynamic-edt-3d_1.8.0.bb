DESCRIPTION = "Implements a Dynamic Euclidean Distance Transform in 3D based on Octrees from the OctoMap library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=980f9f56edc58bbae38814ec2a07a71e"

PARENT_PROJECT = "octomap"

#SRC_URI = "https://github.com/OctoMap/${PARENT_PROJECT}/archive/v${PV}.tar.gz;downloadfilename=${PARENT_PROJECT}-${PV}.tar.gz"
#SRC_URI[md5sum] = "e4f9ab54fecfc031ec160b8989340804"
#SRC_URI[sha256sum] = "833adba0d3b203cab0e28a0180490e74bc852a7fea9adf6ee53bbfb8f10bc79a"

SRC_URI = "git://github.com/octomap/octomap.git;protocol=git;branch=devel"
SRCREV = "595cb83bfe862524ebb571c628486710794c7b04"

#S = "${WORKDIR}/${PARENT_PROJECT}-${PV}/dynamicEDT3D"
S = "${WORKDIR}/git/dynamicEDT3D"

DEPENDS = "octomap"

FILES_${PN}-dev += "/usr/share/dynamicEDT3D"

EXTRA_OECMAKE += "\
    -DCMAKE_SKIP_RPATH=ON \
"

do_install_append() {
    rm -rf ${D}/usr/share/dynamic_edt_3d
}

inherit cmake
