SUMMARY = "Layer for building Python3 bluezero library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66f12994d9f609ef52171aaa0bd371a9"

SRC_URI[md5sum] = "efa07525f1bf6db9af66eb7d9775cdb0"
SRC_URI[sha256sum] = "f146feb65ee9f6fd9f3638ff0a44df9fd6efb48cf66a39ce51a62a7d38ab5206"

PYPI_PACKAGE = "bluezero"

inherit pypi setuptools3

DEPENDS = "python3-dbus glib-2.0 python3-setuptools-native"

RPROVIDES_${PN} += "python3-bluezero"
