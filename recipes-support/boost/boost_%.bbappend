PACKAGECONFIG_append = " python"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://storage.patch"
