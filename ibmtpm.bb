SUMMARY = "ibmtpm Petalinux Wrapper"
SECTION = "PETALINUX/apps"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${THISDIR}/LICENSE;md5=1e023f61454ac828b4aa1bc4293f7d5f"

SRC_URI = "file://emu/"

DEPENDS += " \
    openssl \
"

S = "${WORKDIR}/emu"
TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
	     oe_runmake
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 tpm_server ${D}${bindir}
}
