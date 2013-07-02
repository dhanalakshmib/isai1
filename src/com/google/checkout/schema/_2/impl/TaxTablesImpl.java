//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2.impl;

public class TaxTablesImpl implements com.google.checkout.schema._2.TaxTables, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
{

    protected com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType _AlternateTaxTables;
    protected boolean has_MerchantCalculated;
    protected boolean _MerchantCalculated;
    protected com.google.checkout.schema._2.DefaultTaxTable _DefaultTaxTable;
    public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.google.checkout.schema._2.TaxTables.class);
    }

    public com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType getAlternateTaxTables() {
        return _AlternateTaxTables;
    }

    public void setAlternateTaxTables(com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType value) {
        _AlternateTaxTables = value;
    }

    public boolean isMerchantCalculated() {
        return _MerchantCalculated;
    }

    public void setMerchantCalculated(boolean value) {
        _MerchantCalculated = value;
        has_MerchantCalculated = true;
    }

    public com.google.checkout.schema._2.DefaultTaxTable getDefaultTaxTable() {
        return _DefaultTaxTable;
    }

    public void setDefaultTaxTable(com.google.checkout.schema._2.DefaultTaxTable value) {
        _DefaultTaxTable = value;
    }

    public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
        return new com.google.checkout.schema._2.impl.TaxTablesImpl.Unmarshaller(context);
    }

    public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_AlternateTaxTables!= null) {
            context.startElement("http://checkout.google.com/schema/2", "alternate-tax-tables");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AlternateTaxTables), "AlternateTaxTables");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AlternateTaxTables), "AlternateTaxTables");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _AlternateTaxTables), "AlternateTaxTables");
            context.endElement();
        }
        context.startElement("http://checkout.google.com/schema/2", "default-tax-table");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _DefaultTaxTable), "DefaultTaxTable");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _DefaultTaxTable), "DefaultTaxTable");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _DefaultTaxTable), "DefaultTaxTable");
        context.endElement();
    }

    public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (has_MerchantCalculated) {
            context.startAttribute("", "merchant-calculated");
            try {
                context.text(javax.xml.bind.DatatypeConverter.printBoolean(((boolean) _MerchantCalculated)), "MerchantCalculated");
            } catch (java.lang.Exception e) {
                com.google.checkout.schema._2.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
    }

    public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.google.checkout.schema._2.TaxTables.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000!com.sun.msv.grammar.InterleaveExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun."
+"msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttribut"
+"esL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001"
+"Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\bppsr\u0000 com.sun.msv.gramma"
+"r.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr\u0000 com.sun.msv.grammar.Attri"
+"buteExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003q\u0000~\u0000\u000fpsr"
+"\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000e\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000co"
+"m.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~"
+"\u0000\u001ct\u0000>com.google.checkout.schema._2.TaxTables.AlternateTaxTab"
+"lesTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\bp"
+"psq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dt"
+"t\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLc"
+"om/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype."
+"xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.Builtin"
+"AtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.L"
+"com/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www"
+".w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.dataty"
+"pe.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramm"
+"ar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.su"
+"n.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespac"
+"eURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/"
+"XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0014alternate-tax-tablest\u0000#http:"
+"//checkout.google.com/schema/2q\u0000~\u0000\u001fsq\u0000~\u0000\npp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\npp"
+"\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0013q\u0000~\u0000\u000fpsq\u0000~\u0000\u0016q\u0000~\u0000\u000fpq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000-com"
+".google.checkout.schema._2.DefaultTaxTableq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0016q\u0000~\u0000\u000fpq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0011default-tax-tableq\u0000~\u0000?sq\u0000~\u0000\bp"
+"psq\u0000~\u0000\u0016q\u0000~\u0000\u000fpsq\u0000~\u0000\'ppsr\u0000$com.sun.msv.datatype.xsd.BooleanTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000,q\u0000~\u00001t\u0000\u0007booleanq\u0000~\u00005q\u0000~\u00007sq\u0000~\u00008q\u0000~\u0000Qq\u0000~\u00001s"
+"q\u0000~\u0000 t\u0000\u0013merchant-calculatedt\u0000\u0000q\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.E"
+"xpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/E"
+"xpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressio"
+"nPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parent"
+"t\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\f\u0001pq\u0000~\u0000\u0010q\u0000~\u0000Aq\u0000~"
+"\u0000\u0005q\u0000~\u0000Lq\u0000~\u0000\u0007q\u0000~\u0000%q\u0000~\u0000Hq\u0000~\u0000\u0015q\u0000~\u0000Dq\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000~\u0000\tx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public static class AlternateTaxTablesTypeImpl implements com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType, com.sun.xml.bind.JAXBObject, com.google.checkout.schema._2.impl.runtime.UnmarshallableObject, com.google.checkout.schema._2.impl.runtime.XMLSerializable, com.google.checkout.schema._2.impl.runtime.ValidatableObject
    {

        protected com.sun.xml.bind.util.ListImpl _AlternateTaxTable;
        public final static java.lang.Class version = (com.google.checkout.schema._2.impl.JAXBVersion.class);
        private static com.sun.msv.grammar.Grammar schemaFragment;

        private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
            return (com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType.class);
        }

        protected com.sun.xml.bind.util.ListImpl _getAlternateTaxTable() {
            if (_AlternateTaxTable == null) {
                _AlternateTaxTable = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
            }
            return _AlternateTaxTable;
        }

        public java.util.List getAlternateTaxTable() {
            return _getAlternateTaxTable();
        }

        public com.google.checkout.schema._2.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            return new com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.Unmarshaller(context);
        }

        public void serializeBody(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_AlternateTaxTable == null)? 0 :_AlternateTaxTable.size());
            while (idx1 != len1) {
                context.startElement("http://checkout.google.com/schema/2", "alternate-tax-table");
                int idx_0 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AlternateTaxTable.get(idx_0 ++)), "AlternateTaxTable");
                context.endNamespaceDecls();
                int idx_1 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AlternateTaxTable.get(idx_1 ++)), "AlternateTaxTable");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _AlternateTaxTable.get(idx1 ++)), "AlternateTaxTable");
                context.endElement();
            }
        }

        public void serializeAttributes(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_AlternateTaxTable == null)? 0 :_AlternateTaxTable.size());
            while (idx1 != len1) {
                idx1 += 1;
            }
        }

        public void serializeURIs(com.google.checkout.schema._2.impl.runtime.XMLSerializer context)
            throws org.xml.sax.SAXException
        {
            int idx1 = 0;
            final int len1 = ((_AlternateTaxTable == null)? 0 :_AlternateTaxTable.size());
            while (idx1 != len1) {
                idx1 += 1;
            }
        }

        public java.lang.Class getPrimaryInterface() {
            return (com.google.checkout.schema._2.TaxTables.AlternateTaxTablesType.class);
        }

        public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
            if (schemaFragment == null) {
                schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002x"
+"q\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun"
+".msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLc"
+"om/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.Element"
+"Exp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000"
+"~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\np\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006q\u0000~\u0000\npsr\u0000 com.sun.msv.gramm"
+"ar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\fxq\u0000~\u0000\u0003"
+"q\u0000~\u0000\npsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\t\u0001q\u0000~\u0000\u0017sr\u0000 com.sun.msv.grammar.AnyName"
+"Class\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0018q\u0000~\u0000\u001dsr\u0000#com.sun.msv.grammar.SimpleNameClass"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq"
+"\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000/com.google.checkout.schema._2.AlternateTaxTable"
+"t\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0014"
+"q\u0000~\u0000\npsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg"
+"/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/"
+"msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Qna"
+"meType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicT"
+"ype\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003"
+"L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun"
+"/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org"
+"/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expr"
+"ession$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~"
+"\u0000\u001fxpq\u0000~\u00000q\u0000~\u0000/sq\u0000~\u0000\u001et\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSche"
+"ma-instanceq\u0000~\u0000\u001dsq\u0000~\u0000\u001et\u0000\u0013alternate-tax-tablet\u0000#http://checko"
+"ut.google.com/schema/2q\u0000~\u0000\u001dsr\u0000\"com.sun.msv.grammar.Expressio"
+"nPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expressio"
+"nPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$Cl"
+"osedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/"
+"sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0006\u0001pq\u0000~\u0000\u0010q\u0000~\u0000\u0005q\u0000~\u0000#q\u0000~\u0000\u0013q"
+"\u0000~\u0000\u0012q\u0000~\u0000\bx"));
            }
            return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
        }

        public class Unmarshaller
            extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
        {


            public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
                super(context, "----");
            }

            protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
                this(context);
                state = startState;
            }

            public java.lang.Object owner() {
                return com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.this;
            }

            public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  1 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                                return ;
                            }
                            break;
                        case  0 :
                            if (("alternate-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.pushAttributes(__atts, false);
                                state = 1;
                                return ;
                            }
                            state = 3;
                            continue outer;
                        case  3 :
                            if (("alternate-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.pushAttributes(__atts, false);
                                state = 1;
                                return ;
                            }
                            revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                            return ;
                    }
                    super.enterElement(___uri, ___local, ___qname, __atts);
                    break;
                }
            }

            public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  1 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                                return ;
                            }
                            break;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  3 :
                            revertToParentFromLeaveElement(___uri, ___local, ___qname);
                            return ;
                        case  2 :
                            if (("alternate-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                                context.popAttributes();
                                state = 3;
                                return ;
                            }
                            break;
                    }
                    super.leaveElement(___uri, ___local, ___qname);
                    break;
                }
            }

            public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  1 :
                            if (("name" == ___local)&&("" == ___uri)) {
                                _getAlternateTaxTable().add(((com.google.checkout.schema._2.impl.AlternateTaxTableImpl) spawnChildFromEnterAttribute((com.google.checkout.schema._2.impl.AlternateTaxTableImpl.class), 2, ___uri, ___local, ___qname)));
                                return ;
                            }
                            break;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  3 :
                            revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.enterAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    switch (state) {
                        case  1 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                                return ;
                            }
                            break;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  3 :
                            revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                            return ;
                    }
                    super.leaveAttribute(___uri, ___local, ___qname);
                    break;
                }
            }

            public void handleText(final java.lang.String value)
                throws org.xml.sax.SAXException
            {
                int attIdx;
                outer:
                while (true) {
                    try {
                        switch (state) {
                            case  1 :
                                attIdx = context.getAttribute("", "name");
                                if (attIdx >= 0) {
                                    context.consumeAttribute(attIdx);
                                    context.getCurrentHandler().text(value);
                                    return ;
                                }
                                break;
                            case  0 :
                                state = 3;
                                continue outer;
                            case  3 :
                                revertToParentFromText(value);
                                return ;
                        }
                    } catch (java.lang.RuntimeException e) {
                        handleUnexpectedTextException(value, e);
                    }
                    break;
                }
            }

        }

    }

    public class Unmarshaller
        extends com.google.checkout.schema._2.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(com.google.checkout.schema._2.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.google.checkout.schema._2.impl.TaxTablesImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "merchant-calculated");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        if (("alternate-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("default-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        if (("alternate-tax-tables" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 6;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("tax-rules" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            _DefaultTaxTable = ((com.google.checkout.schema._2.impl.DefaultTaxTableImpl) spawnChildFromEnterElement((com.google.checkout.schema._2.impl.DefaultTaxTableImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _MerchantCalculated = javax.xml.bind.DatatypeConverter.parseBoolean(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                has_MerchantCalculated = true;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        if (("alternate-tax-tables" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "merchant-calculated");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  5 :
                        if (("default-tax-table" == ___local)&&("http://checkout.google.com/schema/2" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromLeaveElement((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("merchant-calculated" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromEnterAttribute((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("merchant-calculated" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "merchant-calculated");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromLeaveAttribute((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, ___uri, ___local, ___qname));
                        return ;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  0 :
                            attIdx = context.getAttribute("", "merchant-calculated");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  6 :
                            _AlternateTaxTables = ((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl) spawnChildFromText((com.google.checkout.schema._2.impl.TaxTablesImpl.AlternateTaxTablesTypeImpl.class), 7, value));
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
