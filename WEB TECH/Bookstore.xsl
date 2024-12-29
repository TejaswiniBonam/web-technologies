<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
	<html>
	<body>
	<h2 align = "center">Bookstore</h2>
	<table border ="2" align = "center">
	<tr bgcolor="gray">
	<th>Title</th>
	<th>Author</th>
	<th>isbn</th>
	<th>Publisher</th>
	<th>Edition</th>
	<th>Price</th>
	</tr>
	<xsl:for-each select = "bookstore/book">
	<tr>
		<td bgcolor = "aqua"> <xsl:value-of select="title"/></td>
		<td bgcolor = "aqua"> <xsl:value-of select="author"/></td>
		<td bgcolor = "aqua"> <xsl:value-of select="isbn"/></td>
		<td bgcolor = "aqua"> <xsl:value-of select="publisher"/></td>
		<td bgcolor = "aqua"> <xsl:value-of select="edition"/></td>
		<td bgcolor = "aqua"> <xsl:value-of select="price"/></td>
	</tr>
	</xsl:for-each>
	</table>
	</body>
	</html>
</xsl:template>
</xsl:stylesheet>
