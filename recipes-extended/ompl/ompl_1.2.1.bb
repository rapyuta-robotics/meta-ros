DESCRIPTION = "The Open Motion Planning Library (OMPL) consists of a set of sampling-based motion planning algorithms."
HOMEPAGE = "http://ompl.kavrakilab.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=923f436234988118e9a042c42a64323c"

DEPENDS = "boost libeigen"

SRC_URI = "https://bitbucket.org/ompl/ompl/downloads/ompl-${PV}-Source.tar.gz"
SRC_URI[md5sum] = "a1634634f59fc1c30e481d563722bcaf"
SRC_URI[sha256sum] = "9d00fdb262222ba5ff5732be84212c6b0ba769b0b0fb64a1189e5f1db1c568eb"

S = "${WORKDIR}/ompl-${PV}-Source"

inherit cmake
