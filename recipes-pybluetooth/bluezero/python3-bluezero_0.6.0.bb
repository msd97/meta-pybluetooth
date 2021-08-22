SUMMARY = "Layer for building Python3 bluezero library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=66f12994d9f609ef52171aaa0bd371a9"

SRC_URI[md5sum] = "b26e6425d8adc4613b7cdf1d131f8c0b"
SRC_URI[sha256sum] = "d94f0672b1de3ff0040801538143fe9a42c501d8db79bcd183c9e051b8da83bc"

PYPI_PACKAGE = "bluezero"

inherit pypi setuptools3

DEPENDS = "python3-dbus glib-2.0 python3-setuptools-native"

RPROVIDES_${PN} += "python3-bluezero"
