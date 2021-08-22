SUMMARY = "Layer for building Python3 bluepy library"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=59e0d45ea684dda215889aa1b5acd001"

SRC_URI = "git://github.com/camm73/bluepy"

SRCREV = "67dbbaab000cacb32b421894acf4e941a076ba68"

S = "${WORKDIR}/git"

inherit setuptools3

DEPENDS = "glib-2.0 python3-setuptools-native"

# Required to prevent NO GNU_HASH package QA error
TARGET_CC_ARCH += "${LDFLAGS}"
# INSANE_SKIP_${PN} = "ldflags"

RPROVIDES_${PN} += "python3-bluepy"
