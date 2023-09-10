require recipes-kernel/linux/linux-jf4418.inc
DESCRIPTION = "Linux kernel for JF4418"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "(jf4418)"

PV = "3.4.1"
PR = "r0"

SRCREV_pn-${PN} = "${AUTOREV}"

SRC_URI += "git://github.com/kamejoko80/linux-3.4.x-jf4418.git;protocol=https"

S = "${WORKDIR}/git/"
LDFLAGS = ""
TARGET_LDFLAGS = ""
B = "${S}"

