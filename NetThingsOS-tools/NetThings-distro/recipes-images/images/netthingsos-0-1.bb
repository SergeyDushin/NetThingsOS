SUMMARY = "NetThingsOS is a distribusion for managing IoT systems on the local side of  distributed IoT systems"


#PN="NetThingsOS"
#PV="0.1"

LICENSE = "GPL v2"

IMAGE_FEATURES += "package-management"
IMAGE_INSTALL += " packagegroup-core-boot packagegroup-base \
                 kernel-dev kernel-devsrc connman connman-plugin-ethernet "


#
# Installed packages
#
IMAGE_INSTALL_append+= " busybox"
IMAGE_INSTALL_append+= " mosquitto"
IMAGE_INSTALL_append+= "zip"
IMAGE_INSTALL_append+= "sudo"
IMAGE_INSTALL_append+= "man-pages"
IMAGE_INSTALL_append+= "iputils"
IMAGE_INSTALL_append+= "inetutils"
IMAGE_INSTALL_append+= "iproute2"
IMAGE_INSTALL_append+= "bind"
IMAGE_INSTALL_append+= "collectd"
IMAGE_INSTALL_append+= "glibc-utils localedef"
IMAGE_INSTALL_append+= "mailx"
IMAGE_INSTALL_append+= "net-tools"
IMAGE_INSTALL_append+= "cronie"
IMAGE_INSTALL_append+= "curl"
IMAGE_INSTALL_append+= "coreutils"
IMAGE_INSTALL_append+= "monit"
IMAGE_INSTALL_append+= "ntp"
IMAGE_INSTALL_append+= "thingsboard-gateway"


DISTRO_FEATURES_LIBC = "libc-locales libc-locale-code"
ENABLE_BINARY_LOCALE_GENERATION = "1"
GLIBC_GENERATE_LOCALES = "en_GB.UTF-8 en_US.UTF-8 ru_RU.UTF-8"
IMAGE_LINGUAS = "ru-ru en-gb en-us"
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

DEPENDS = "zip-native python3-pip-native"
inherit core-image module-base setuptools3
