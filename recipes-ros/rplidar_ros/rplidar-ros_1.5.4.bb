DESCRIPTION = "The rplidar ros package support rplidar and rplidar A2"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18bbc21269bc262d7403b8db7df2f738"

SRC_URI = "git://github.com/robopeak/rplidar_ros.git"
SRCREV = "3187e5e69722cf05514125234a2129ccfecd2b7d"

S = "${WORKDIR}/git"

inherit catkin
