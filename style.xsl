<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" >
    <xsl:output method="text" omit-xml-declaration="yes" indent="no"/>
    <xsl:template match="/">

<!--key, SegEN, SegES-->

        <xsl:for-each select="//tu">
            <xsl:value-of select="concat(@tuid, ',', tuv/seg, ',', tuv[position() mod 2 = 0]/seg, '&#xA;')"/>
        </xsl:for-each>

    </xsl:template>
</xsl:stylesheet>




