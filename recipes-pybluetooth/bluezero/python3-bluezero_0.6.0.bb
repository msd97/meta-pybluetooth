SUMMARY = "Layer for building Python3 bluezero library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=66f12994d9f609ef52171aaa0bd371a9"

SRC_URI = "git://github.com/ukBaz/python-bluezero"

SRCREV = "3197269173f63d80bc0cf380da88709bc39bdc19"

S = "${WORKDIR}/git"

inherit setuptools3

DEPENDS = "python3-dbus glib-2.0 python3-setuptools-native"

# Required to prevent NO GNU_HASH package QA error
INSANE_SKIP_${PN} = "ldflags"

RPROVIDES_${PN} += "python3-bluezero"
