SUMMARY = "NetThingsOS ditro"


#PN="NetThingsOS"
#PV="0.1"

LICENSE = "GPL v2"

IMAGE_FEATURES += "package-management"
IMAGE_INSTALL += " packagegroup-core-boot packagegroup-base \
                 kernel-dev kernel-devsrc connman connman-plugin-ethernet "


#
# Install packages
#
IMAGE_INSTALL_append+= " busybox"
IMAGE_INSTALL_append+= " mosquitto"


DISTRO_FEATURES_LIBC = "libc-locales libc-locale-code"
ENABLE_BINARY_LOCALE_GENERATION = "1"
GLIBC_GENERATE_LOCALES = "en_GB.UTF-8 en_US.UTF-8 ru_RU.UTF-8"
IMAGE_LINGUAS = "ru-ru en-gb en-us"
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

DEPENDS = "zip-native python3-pip-native"
inherit core-image module-base setuptools3
