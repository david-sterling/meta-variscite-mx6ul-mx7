DESCRIPTION = "U-Boot for Variscite DART-6UL / VAR-SOM-MX7"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES = "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH_mx6ul = "imx_v2015.10_dart_6ul_var1"
SRCBRANCH_mx7 = "imx_v2017.03_4.9.11_1.0.0_ga_var01"
UBOOT_SRC = "git://github.com/varigit/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6ul|mx7)"
