<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="UMLReaderLib"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="self"/>
		<constant value="hasStereotype"/>
		<constant value="MUML!Element;"/>
		<constant value="1"/>
		<constant value="J"/>
		<constant value="0"/>
		<constant value="J.getAppliedStereotypes():J"/>
		<constant value="2"/>
		<constant value="name"/>
		<constant value="J.=(J):J"/>
		<constant value="B.or(B):B"/>
		<constant value="5:1-5:5"/>
		<constant value="5:1-5:29"/>
		<constant value="5:40-5:41"/>
		<constant value="5:40-5:46"/>
		<constant value="5:47-5:57"/>
		<constant value="5:40-5:57"/>
		<constant value="5:1-5:58"/>
		<constant value="e"/>
		<constant value="stereotype"/>
		<constant value="getStereotype"/>
		<constant value="Sequence"/>
		<constant value="#native"/>
		<constant value="B.not():B"/>
		<constant value="15"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="QJ.first():J"/>
		<constant value="9:1-9:5"/>
		<constant value="9:1-9:29"/>
		<constant value="9:37-9:38"/>
		<constant value="9:37-9:43"/>
		<constant value="9:44-9:54"/>
		<constant value="9:37-9:54"/>
		<constant value="9:1-9:55"/>
	</cp>
	<operation name="1">
		<context type="2"/>
		<parameters>
		</parameters>
		<code>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="3" begin="0" end="-1"/>
		</localvariabletable>
	</operation>
	<operation name="4">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<pushf/>
			<load arg="8"/>
			<call arg="9"/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<get arg="11"/>
			<load arg="6"/>
			<call arg="12"/>
			<call arg="13"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="14" begin="1" end="1"/>
			<lne id="15" begin="1" end="2"/>
			<lne id="16" begin="5" end="5"/>
			<lne id="17" begin="5" end="6"/>
			<lne id="18" begin="7" end="7"/>
			<lne id="19" begin="5" end="8"/>
			<lne id="20" begin="0" end="10"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="21" begin="4" end="9"/>
			<lve slot="0" name="3" begin="0" end="10"/>
			<lve slot="1" name="22" begin="0" end="10"/>
		</localvariabletable>
	</operation>
	<operation name="23">
		<context type="5"/>
		<parameters>
			<parameter name="6" type="7"/>
		</parameters>
		<code>
			<push arg="24"/>
			<push arg="25"/>
			<new/>
			<load arg="8"/>
			<call arg="9"/>
			<iterate/>
			<store arg="10"/>
			<load arg="10"/>
			<get arg="11"/>
			<load arg="6"/>
			<call arg="12"/>
			<call arg="26"/>
			<if arg="27"/>
			<load arg="10"/>
			<call arg="28"/>
			<enditerate/>
			<call arg="29"/>
			<call arg="30"/>
		</code>
		<linenumbertable>
			<lne id="31" begin="3" end="3"/>
			<lne id="32" begin="3" end="4"/>
			<lne id="33" begin="7" end="7"/>
			<lne id="34" begin="7" end="8"/>
			<lne id="35" begin="9" end="9"/>
			<lne id="36" begin="7" end="10"/>
			<lne id="37" begin="0" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="21" begin="6" end="14"/>
			<lve slot="0" name="3" begin="0" end="17"/>
			<lve slot="1" name="22" begin="0" end="17"/>
		</localvariabletable>
	</operation>
</asm>
