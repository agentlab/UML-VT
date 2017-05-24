package org.eclipse.uml.verification.tl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.uml.verification.tl.services.TemporalLogicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemporalLogicParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TEST", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AG'", "'AF'", "'EG'", "'EF'", "'NOT'", "'G'", "'F'", "'AND'", "'OR'", "'=>'", "'import'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_TEST=5;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTemporalLogicParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemporalLogicParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemporalLogicParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTemporalLogic.g"; }


    	private TemporalLogicGrammarAccess grammarAccess;

    	public void setGrammarAccess(TemporalLogicGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalTemporalLogic.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTemporalLogic.g:54:1: ( ruleModel EOF )
            // InternalTemporalLogic.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTemporalLogic.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalTemporalLogic.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalTemporalLogic.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalTemporalLogic.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalTemporalLogic.g:69:3: ( rule__Model__Group__0 )
            // InternalTemporalLogic.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOption"
    // InternalTemporalLogic.g:78:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalTemporalLogic.g:79:1: ( ruleOption EOF )
            // InternalTemporalLogic.g:80:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalTemporalLogic.g:87:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:91:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalTemporalLogic.g:92:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalTemporalLogic.g:92:2: ( ( rule__Option__Alternatives ) )
            // InternalTemporalLogic.g:93:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalTemporalLogic.g:94:3: ( rule__Option__Alternatives )
            // InternalTemporalLogic.g:94:4: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleImport"
    // InternalTemporalLogic.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTemporalLogic.g:104:1: ( ruleImport EOF )
            // InternalTemporalLogic.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTemporalLogic.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTemporalLogic.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTemporalLogic.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalTemporalLogic.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTemporalLogic.g:119:3: ( rule__Import__Group__0 )
            // InternalTemporalLogic.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProperty1"
    // InternalTemporalLogic.g:128:1: entryRuleProperty1 : ruleProperty1 EOF ;
    public final void entryRuleProperty1() throws RecognitionException {
        try {
            // InternalTemporalLogic.g:129:1: ( ruleProperty1 EOF )
            // InternalTemporalLogic.g:130:1: ruleProperty1 EOF
            {
             before(grammarAccess.getProperty1Rule()); 
            pushFollow(FOLLOW_1);
            ruleProperty1();

            state._fsp--;

             after(grammarAccess.getProperty1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty1"


    // $ANTLR start "ruleProperty1"
    // InternalTemporalLogic.g:137:1: ruleProperty1 : ( ( rule__Property1__Group__0 ) ) ;
    public final void ruleProperty1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:141:2: ( ( ( rule__Property1__Group__0 ) ) )
            // InternalTemporalLogic.g:142:2: ( ( rule__Property1__Group__0 ) )
            {
            // InternalTemporalLogic.g:142:2: ( ( rule__Property1__Group__0 ) )
            // InternalTemporalLogic.g:143:3: ( rule__Property1__Group__0 )
            {
             before(grammarAccess.getProperty1Access().getGroup()); 
            // InternalTemporalLogic.g:144:3: ( rule__Property1__Group__0 )
            // InternalTemporalLogic.g:144:4: rule__Property1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProperty1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty1"


    // $ANTLR start "entryRuleProperty2"
    // InternalTemporalLogic.g:153:1: entryRuleProperty2 : ruleProperty2 EOF ;
    public final void entryRuleProperty2() throws RecognitionException {
        try {
            // InternalTemporalLogic.g:154:1: ( ruleProperty2 EOF )
            // InternalTemporalLogic.g:155:1: ruleProperty2 EOF
            {
             before(grammarAccess.getProperty2Rule()); 
            pushFollow(FOLLOW_1);
            ruleProperty2();

            state._fsp--;

             after(grammarAccess.getProperty2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty2"


    // $ANTLR start "ruleProperty2"
    // InternalTemporalLogic.g:162:1: ruleProperty2 : ( ( rule__Property2__Group__0 ) ) ;
    public final void ruleProperty2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:166:2: ( ( ( rule__Property2__Group__0 ) ) )
            // InternalTemporalLogic.g:167:2: ( ( rule__Property2__Group__0 ) )
            {
            // InternalTemporalLogic.g:167:2: ( ( rule__Property2__Group__0 ) )
            // InternalTemporalLogic.g:168:3: ( rule__Property2__Group__0 )
            {
             before(grammarAccess.getProperty2Access().getGroup()); 
            // InternalTemporalLogic.g:169:3: ( rule__Property2__Group__0 )
            // InternalTemporalLogic.g:169:4: rule__Property2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty2"


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalTemporalLogic.g:177:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__Property1Assignment_1_0 ) ) | ( ( rule__Model__Property2Assignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:181:1: ( ( ( rule__Model__Property1Assignment_1_0 ) ) | ( ( rule__Model__Property2Assignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=12 && LA1_0<=18)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_TEST) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTemporalLogic.g:182:2: ( ( rule__Model__Property1Assignment_1_0 ) )
                    {
                    // InternalTemporalLogic.g:182:2: ( ( rule__Model__Property1Assignment_1_0 ) )
                    // InternalTemporalLogic.g:183:3: ( rule__Model__Property1Assignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getProperty1Assignment_1_0()); 
                    // InternalTemporalLogic.g:184:3: ( rule__Model__Property1Assignment_1_0 )
                    // InternalTemporalLogic.g:184:4: rule__Model__Property1Assignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Property1Assignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProperty1Assignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:188:2: ( ( rule__Model__Property2Assignment_1_1 ) )
                    {
                    // InternalTemporalLogic.g:188:2: ( ( rule__Model__Property2Assignment_1_1 ) )
                    // InternalTemporalLogic.g:189:3: ( rule__Model__Property2Assignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getProperty2Assignment_1_1()); 
                    // InternalTemporalLogic.g:190:3: ( rule__Model__Property2Assignment_1_1 )
                    // InternalTemporalLogic.g:190:4: rule__Model__Property2Assignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Property2Assignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProperty2Assignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__Option__Alternatives"
    // InternalTemporalLogic.g:198:1: rule__Option__Alternatives : ( ( ruleProperty1 ) | ( ruleProperty2 ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:202:1: ( ( ruleProperty1 ) | ( ruleProperty2 ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TEST) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTemporalLogic.g:203:2: ( ruleProperty1 )
                    {
                    // InternalTemporalLogic.g:203:2: ( ruleProperty1 )
                    // InternalTemporalLogic.g:204:3: ruleProperty1
                    {
                     before(grammarAccess.getOptionAccess().getProperty1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProperty1();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getProperty1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:209:2: ( ruleProperty2 )
                    {
                    // InternalTemporalLogic.g:209:2: ( ruleProperty2 )
                    // InternalTemporalLogic.g:210:3: ruleProperty2
                    {
                     before(grammarAccess.getOptionAccess().getProperty2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProperty2();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getProperty2ParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__Property1__OperatorAlternatives_0_0"
    // InternalTemporalLogic.g:219:1: rule__Property1__OperatorAlternatives_0_0 : ( ( 'AG' ) | ( 'AF' ) | ( 'EG' ) | ( 'EF' ) | ( 'NOT' ) | ( 'G' ) | ( 'F' ) );
    public final void rule__Property1__OperatorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:223:1: ( ( 'AG' ) | ( 'AF' ) | ( 'EG' ) | ( 'EF' ) | ( 'NOT' ) | ( 'G' ) | ( 'F' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTemporalLogic.g:224:2: ( 'AG' )
                    {
                    // InternalTemporalLogic.g:224:2: ( 'AG' )
                    // InternalTemporalLogic.g:225:3: 'AG'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorAGKeyword_0_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorAGKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:230:2: ( 'AF' )
                    {
                    // InternalTemporalLogic.g:230:2: ( 'AF' )
                    // InternalTemporalLogic.g:231:3: 'AF'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorAFKeyword_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorAFKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTemporalLogic.g:236:2: ( 'EG' )
                    {
                    // InternalTemporalLogic.g:236:2: ( 'EG' )
                    // InternalTemporalLogic.g:237:3: 'EG'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorEGKeyword_0_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorEGKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTemporalLogic.g:242:2: ( 'EF' )
                    {
                    // InternalTemporalLogic.g:242:2: ( 'EF' )
                    // InternalTemporalLogic.g:243:3: 'EF'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorEFKeyword_0_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorEFKeyword_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTemporalLogic.g:248:2: ( 'NOT' )
                    {
                    // InternalTemporalLogic.g:248:2: ( 'NOT' )
                    // InternalTemporalLogic.g:249:3: 'NOT'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorNOTKeyword_0_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorNOTKeyword_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTemporalLogic.g:254:2: ( 'G' )
                    {
                    // InternalTemporalLogic.g:254:2: ( 'G' )
                    // InternalTemporalLogic.g:255:3: 'G'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorGKeyword_0_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorGKeyword_0_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTemporalLogic.g:260:2: ( 'F' )
                    {
                    // InternalTemporalLogic.g:260:2: ( 'F' )
                    // InternalTemporalLogic.g:261:3: 'F'
                    {
                     before(grammarAccess.getProperty1Access().getOperatorFKeyword_0_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getProperty1Access().getOperatorFKeyword_0_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__OperatorAlternatives_0_0"


    // $ANTLR start "rule__Property1__Alternatives_2"
    // InternalTemporalLogic.g:270:1: rule__Property1__Alternatives_2 : ( ( ( rule__Property1__ModelElement1Assignment_2_0 ) ) | ( ( rule__Property1__NextAssignment_2_1 ) ) );
    public final void rule__Property1__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:274:1: ( ( ( rule__Property1__ModelElement1Assignment_2_0 ) ) | ( ( rule__Property1__NextAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TEST) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else if ( ((LA4_1>=19 && LA4_1<=21)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=12 && LA4_0<=18)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTemporalLogic.g:275:2: ( ( rule__Property1__ModelElement1Assignment_2_0 ) )
                    {
                    // InternalTemporalLogic.g:275:2: ( ( rule__Property1__ModelElement1Assignment_2_0 ) )
                    // InternalTemporalLogic.g:276:3: ( rule__Property1__ModelElement1Assignment_2_0 )
                    {
                     before(grammarAccess.getProperty1Access().getModelElement1Assignment_2_0()); 
                    // InternalTemporalLogic.g:277:3: ( rule__Property1__ModelElement1Assignment_2_0 )
                    // InternalTemporalLogic.g:277:4: rule__Property1__ModelElement1Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property1__ModelElement1Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProperty1Access().getModelElement1Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:281:2: ( ( rule__Property1__NextAssignment_2_1 ) )
                    {
                    // InternalTemporalLogic.g:281:2: ( ( rule__Property1__NextAssignment_2_1 ) )
                    // InternalTemporalLogic.g:282:3: ( rule__Property1__NextAssignment_2_1 )
                    {
                     before(grammarAccess.getProperty1Access().getNextAssignment_2_1()); 
                    // InternalTemporalLogic.g:283:3: ( rule__Property1__NextAssignment_2_1 )
                    // InternalTemporalLogic.g:283:4: rule__Property1__NextAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property1__NextAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProperty1Access().getNextAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Alternatives_2"


    // $ANTLR start "rule__Property2__OperatorAlternatives_1_0"
    // InternalTemporalLogic.g:291:1: rule__Property2__OperatorAlternatives_1_0 : ( ( 'AND' ) | ( 'OR' ) | ( '=>' ) );
    public final void rule__Property2__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:295:1: ( ( 'AND' ) | ( 'OR' ) | ( '=>' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTemporalLogic.g:296:2: ( 'AND' )
                    {
                    // InternalTemporalLogic.g:296:2: ( 'AND' )
                    // InternalTemporalLogic.g:297:3: 'AND'
                    {
                     before(grammarAccess.getProperty2Access().getOperatorANDKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getProperty2Access().getOperatorANDKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:302:2: ( 'OR' )
                    {
                    // InternalTemporalLogic.g:302:2: ( 'OR' )
                    // InternalTemporalLogic.g:303:3: 'OR'
                    {
                     before(grammarAccess.getProperty2Access().getOperatorORKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getProperty2Access().getOperatorORKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTemporalLogic.g:308:2: ( '=>' )
                    {
                    // InternalTemporalLogic.g:308:2: ( '=>' )
                    // InternalTemporalLogic.g:309:3: '=>'
                    {
                     before(grammarAccess.getProperty2Access().getOperatorEqualsSignGreaterThanSignKeyword_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getProperty2Access().getOperatorEqualsSignGreaterThanSignKeyword_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__OperatorAlternatives_1_0"


    // $ANTLR start "rule__Property2__Alternatives_2"
    // InternalTemporalLogic.g:318:1: rule__Property2__Alternatives_2 : ( ( ( rule__Property2__ModelElement2Assignment_2_0 ) ) | ( ( rule__Property2__Group_2_1__0 ) ) );
    public final void rule__Property2__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:322:1: ( ( ( rule__Property2__ModelElement2Assignment_2_0 ) ) | ( ( rule__Property2__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TEST) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTemporalLogic.g:323:2: ( ( rule__Property2__ModelElement2Assignment_2_0 ) )
                    {
                    // InternalTemporalLogic.g:323:2: ( ( rule__Property2__ModelElement2Assignment_2_0 ) )
                    // InternalTemporalLogic.g:324:3: ( rule__Property2__ModelElement2Assignment_2_0 )
                    {
                     before(grammarAccess.getProperty2Access().getModelElement2Assignment_2_0()); 
                    // InternalTemporalLogic.g:325:3: ( rule__Property2__ModelElement2Assignment_2_0 )
                    // InternalTemporalLogic.g:325:4: rule__Property2__ModelElement2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property2__ModelElement2Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProperty2Access().getModelElement2Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:329:2: ( ( rule__Property2__Group_2_1__0 ) )
                    {
                    // InternalTemporalLogic.g:329:2: ( ( rule__Property2__Group_2_1__0 ) )
                    // InternalTemporalLogic.g:330:3: ( rule__Property2__Group_2_1__0 )
                    {
                     before(grammarAccess.getProperty2Access().getGroup_2_1()); 
                    // InternalTemporalLogic.g:331:3: ( rule__Property2__Group_2_1__0 )
                    // InternalTemporalLogic.g:331:4: rule__Property2__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property2__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProperty2Access().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Alternatives_2"


    // $ANTLR start "rule__Model__Group__0"
    // InternalTemporalLogic.g:339:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:343:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalTemporalLogic.g:344:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalTemporalLogic.g:351:1: rule__Model__Group__0__Impl : ( ( rule__Model__LocationAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:355:1: ( ( ( rule__Model__LocationAssignment_0 )? ) )
            // InternalTemporalLogic.g:356:1: ( ( rule__Model__LocationAssignment_0 )? )
            {
            // InternalTemporalLogic.g:356:1: ( ( rule__Model__LocationAssignment_0 )? )
            // InternalTemporalLogic.g:357:2: ( rule__Model__LocationAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getLocationAssignment_0()); 
            // InternalTemporalLogic.g:358:2: ( rule__Model__LocationAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemporalLogic.g:358:3: rule__Model__LocationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__LocationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getLocationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalTemporalLogic.g:366:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:370:1: ( rule__Model__Group__1__Impl )
            // InternalTemporalLogic.g:371:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalTemporalLogic.g:377:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:381:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // InternalTemporalLogic.g:382:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // InternalTemporalLogic.g:382:1: ( ( rule__Model__Alternatives_1 )* )
            // InternalTemporalLogic.g:383:2: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalTemporalLogic.g:384:2: ( rule__Model__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_TEST||(LA8_0>=12 && LA8_0<=18)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTemporalLogic.g:384:3: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTemporalLogic.g:393:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:397:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTemporalLogic.g:398:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalTemporalLogic.g:405:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:409:1: ( ( 'import' ) )
            // InternalTemporalLogic.g:410:1: ( 'import' )
            {
            // InternalTemporalLogic.g:410:1: ( 'import' )
            // InternalTemporalLogic.g:411:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalTemporalLogic.g:420:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:424:1: ( rule__Import__Group__1__Impl )
            // InternalTemporalLogic.g:425:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalTemporalLogic.g:431:1: rule__Import__Group__1__Impl : ( ( rule__Import__ModelAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:435:1: ( ( ( rule__Import__ModelAssignment_1 ) ) )
            // InternalTemporalLogic.g:436:1: ( ( rule__Import__ModelAssignment_1 ) )
            {
            // InternalTemporalLogic.g:436:1: ( ( rule__Import__ModelAssignment_1 ) )
            // InternalTemporalLogic.g:437:2: ( rule__Import__ModelAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getModelAssignment_1()); 
            // InternalTemporalLogic.g:438:2: ( rule__Import__ModelAssignment_1 )
            // InternalTemporalLogic.g:438:3: rule__Import__ModelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getModelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Property1__Group__0"
    // InternalTemporalLogic.g:447:1: rule__Property1__Group__0 : rule__Property1__Group__0__Impl rule__Property1__Group__1 ;
    public final void rule__Property1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:451:1: ( rule__Property1__Group__0__Impl rule__Property1__Group__1 )
            // InternalTemporalLogic.g:452:2: rule__Property1__Group__0__Impl rule__Property1__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Property1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__0"


    // $ANTLR start "rule__Property1__Group__0__Impl"
    // InternalTemporalLogic.g:459:1: rule__Property1__Group__0__Impl : ( ( rule__Property1__OperatorAssignment_0 ) ) ;
    public final void rule__Property1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:463:1: ( ( ( rule__Property1__OperatorAssignment_0 ) ) )
            // InternalTemporalLogic.g:464:1: ( ( rule__Property1__OperatorAssignment_0 ) )
            {
            // InternalTemporalLogic.g:464:1: ( ( rule__Property1__OperatorAssignment_0 ) )
            // InternalTemporalLogic.g:465:2: ( rule__Property1__OperatorAssignment_0 )
            {
             before(grammarAccess.getProperty1Access().getOperatorAssignment_0()); 
            // InternalTemporalLogic.g:466:2: ( rule__Property1__OperatorAssignment_0 )
            // InternalTemporalLogic.g:466:3: rule__Property1__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property1__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProperty1Access().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__0__Impl"


    // $ANTLR start "rule__Property1__Group__1"
    // InternalTemporalLogic.g:474:1: rule__Property1__Group__1 : rule__Property1__Group__1__Impl rule__Property1__Group__2 ;
    public final void rule__Property1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:478:1: ( rule__Property1__Group__1__Impl rule__Property1__Group__2 )
            // InternalTemporalLogic.g:479:2: rule__Property1__Group__1__Impl rule__Property1__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Property1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__1"


    // $ANTLR start "rule__Property1__Group__1__Impl"
    // InternalTemporalLogic.g:486:1: rule__Property1__Group__1__Impl : ( '(' ) ;
    public final void rule__Property1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:490:1: ( ( '(' ) )
            // InternalTemporalLogic.g:491:1: ( '(' )
            {
            // InternalTemporalLogic.g:491:1: ( '(' )
            // InternalTemporalLogic.g:492:2: '('
            {
             before(grammarAccess.getProperty1Access().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProperty1Access().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__1__Impl"


    // $ANTLR start "rule__Property1__Group__2"
    // InternalTemporalLogic.g:501:1: rule__Property1__Group__2 : rule__Property1__Group__2__Impl rule__Property1__Group__3 ;
    public final void rule__Property1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:505:1: ( rule__Property1__Group__2__Impl rule__Property1__Group__3 )
            // InternalTemporalLogic.g:506:2: rule__Property1__Group__2__Impl rule__Property1__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Property1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__2"


    // $ANTLR start "rule__Property1__Group__2__Impl"
    // InternalTemporalLogic.g:513:1: rule__Property1__Group__2__Impl : ( ( rule__Property1__Alternatives_2 ) ) ;
    public final void rule__Property1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:517:1: ( ( ( rule__Property1__Alternatives_2 ) ) )
            // InternalTemporalLogic.g:518:1: ( ( rule__Property1__Alternatives_2 ) )
            {
            // InternalTemporalLogic.g:518:1: ( ( rule__Property1__Alternatives_2 ) )
            // InternalTemporalLogic.g:519:2: ( rule__Property1__Alternatives_2 )
            {
             before(grammarAccess.getProperty1Access().getAlternatives_2()); 
            // InternalTemporalLogic.g:520:2: ( rule__Property1__Alternatives_2 )
            // InternalTemporalLogic.g:520:3: rule__Property1__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Property1__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getProperty1Access().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__2__Impl"


    // $ANTLR start "rule__Property1__Group__3"
    // InternalTemporalLogic.g:528:1: rule__Property1__Group__3 : rule__Property1__Group__3__Impl ;
    public final void rule__Property1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:532:1: ( rule__Property1__Group__3__Impl )
            // InternalTemporalLogic.g:533:2: rule__Property1__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property1__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__3"


    // $ANTLR start "rule__Property1__Group__3__Impl"
    // InternalTemporalLogic.g:539:1: rule__Property1__Group__3__Impl : ( ')' ) ;
    public final void rule__Property1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:543:1: ( ( ')' ) )
            // InternalTemporalLogic.g:544:1: ( ')' )
            {
            // InternalTemporalLogic.g:544:1: ( ')' )
            // InternalTemporalLogic.g:545:2: ')'
            {
             before(grammarAccess.getProperty1Access().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProperty1Access().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__Group__3__Impl"


    // $ANTLR start "rule__Property2__Group__0"
    // InternalTemporalLogic.g:555:1: rule__Property2__Group__0 : rule__Property2__Group__0__Impl rule__Property2__Group__1 ;
    public final void rule__Property2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:559:1: ( rule__Property2__Group__0__Impl rule__Property2__Group__1 )
            // InternalTemporalLogic.g:560:2: rule__Property2__Group__0__Impl rule__Property2__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Property2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__0"


    // $ANTLR start "rule__Property2__Group__0__Impl"
    // InternalTemporalLogic.g:567:1: rule__Property2__Group__0__Impl : ( ( rule__Property2__ModelElement1Assignment_0 ) ) ;
    public final void rule__Property2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:571:1: ( ( ( rule__Property2__ModelElement1Assignment_0 ) ) )
            // InternalTemporalLogic.g:572:1: ( ( rule__Property2__ModelElement1Assignment_0 ) )
            {
            // InternalTemporalLogic.g:572:1: ( ( rule__Property2__ModelElement1Assignment_0 ) )
            // InternalTemporalLogic.g:573:2: ( rule__Property2__ModelElement1Assignment_0 )
            {
             before(grammarAccess.getProperty2Access().getModelElement1Assignment_0()); 
            // InternalTemporalLogic.g:574:2: ( rule__Property2__ModelElement1Assignment_0 )
            // InternalTemporalLogic.g:574:3: rule__Property2__ModelElement1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property2__ModelElement1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getModelElement1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__0__Impl"


    // $ANTLR start "rule__Property2__Group__1"
    // InternalTemporalLogic.g:582:1: rule__Property2__Group__1 : rule__Property2__Group__1__Impl rule__Property2__Group__2 ;
    public final void rule__Property2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:586:1: ( rule__Property2__Group__1__Impl rule__Property2__Group__2 )
            // InternalTemporalLogic.g:587:2: rule__Property2__Group__1__Impl rule__Property2__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Property2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__1"


    // $ANTLR start "rule__Property2__Group__1__Impl"
    // InternalTemporalLogic.g:594:1: rule__Property2__Group__1__Impl : ( ( rule__Property2__OperatorAssignment_1 ) ) ;
    public final void rule__Property2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:598:1: ( ( ( rule__Property2__OperatorAssignment_1 ) ) )
            // InternalTemporalLogic.g:599:1: ( ( rule__Property2__OperatorAssignment_1 ) )
            {
            // InternalTemporalLogic.g:599:1: ( ( rule__Property2__OperatorAssignment_1 ) )
            // InternalTemporalLogic.g:600:2: ( rule__Property2__OperatorAssignment_1 )
            {
             before(grammarAccess.getProperty2Access().getOperatorAssignment_1()); 
            // InternalTemporalLogic.g:601:2: ( rule__Property2__OperatorAssignment_1 )
            // InternalTemporalLogic.g:601:3: rule__Property2__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property2__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__1__Impl"


    // $ANTLR start "rule__Property2__Group__2"
    // InternalTemporalLogic.g:609:1: rule__Property2__Group__2 : rule__Property2__Group__2__Impl ;
    public final void rule__Property2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:613:1: ( rule__Property2__Group__2__Impl )
            // InternalTemporalLogic.g:614:2: rule__Property2__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property2__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__2"


    // $ANTLR start "rule__Property2__Group__2__Impl"
    // InternalTemporalLogic.g:620:1: rule__Property2__Group__2__Impl : ( ( rule__Property2__Alternatives_2 ) ) ;
    public final void rule__Property2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:624:1: ( ( ( rule__Property2__Alternatives_2 ) ) )
            // InternalTemporalLogic.g:625:1: ( ( rule__Property2__Alternatives_2 ) )
            {
            // InternalTemporalLogic.g:625:1: ( ( rule__Property2__Alternatives_2 ) )
            // InternalTemporalLogic.g:626:2: ( rule__Property2__Alternatives_2 )
            {
             before(grammarAccess.getProperty2Access().getAlternatives_2()); 
            // InternalTemporalLogic.g:627:2: ( rule__Property2__Alternatives_2 )
            // InternalTemporalLogic.g:627:3: rule__Property2__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Property2__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group__2__Impl"


    // $ANTLR start "rule__Property2__Group_2_1__0"
    // InternalTemporalLogic.g:636:1: rule__Property2__Group_2_1__0 : rule__Property2__Group_2_1__0__Impl rule__Property2__Group_2_1__1 ;
    public final void rule__Property2__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:640:1: ( rule__Property2__Group_2_1__0__Impl rule__Property2__Group_2_1__1 )
            // InternalTemporalLogic.g:641:2: rule__Property2__Group_2_1__0__Impl rule__Property2__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Property2__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property2__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__0"


    // $ANTLR start "rule__Property2__Group_2_1__0__Impl"
    // InternalTemporalLogic.g:648:1: rule__Property2__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Property2__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:652:1: ( ( '(' ) )
            // InternalTemporalLogic.g:653:1: ( '(' )
            {
            // InternalTemporalLogic.g:653:1: ( '(' )
            // InternalTemporalLogic.g:654:2: '('
            {
             before(grammarAccess.getProperty2Access().getLeftParenthesisKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProperty2Access().getLeftParenthesisKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__0__Impl"


    // $ANTLR start "rule__Property2__Group_2_1__1"
    // InternalTemporalLogic.g:663:1: rule__Property2__Group_2_1__1 : rule__Property2__Group_2_1__1__Impl rule__Property2__Group_2_1__2 ;
    public final void rule__Property2__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:667:1: ( rule__Property2__Group_2_1__1__Impl rule__Property2__Group_2_1__2 )
            // InternalTemporalLogic.g:668:2: rule__Property2__Group_2_1__1__Impl rule__Property2__Group_2_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Property2__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property2__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__1"


    // $ANTLR start "rule__Property2__Group_2_1__1__Impl"
    // InternalTemporalLogic.g:675:1: rule__Property2__Group_2_1__1__Impl : ( ( rule__Property2__NextAssignment_2_1_1 ) ) ;
    public final void rule__Property2__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:679:1: ( ( ( rule__Property2__NextAssignment_2_1_1 ) ) )
            // InternalTemporalLogic.g:680:1: ( ( rule__Property2__NextAssignment_2_1_1 ) )
            {
            // InternalTemporalLogic.g:680:1: ( ( rule__Property2__NextAssignment_2_1_1 ) )
            // InternalTemporalLogic.g:681:2: ( rule__Property2__NextAssignment_2_1_1 )
            {
             before(grammarAccess.getProperty2Access().getNextAssignment_2_1_1()); 
            // InternalTemporalLogic.g:682:2: ( rule__Property2__NextAssignment_2_1_1 )
            // InternalTemporalLogic.g:682:3: rule__Property2__NextAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Property2__NextAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getNextAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__1__Impl"


    // $ANTLR start "rule__Property2__Group_2_1__2"
    // InternalTemporalLogic.g:690:1: rule__Property2__Group_2_1__2 : rule__Property2__Group_2_1__2__Impl ;
    public final void rule__Property2__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:694:1: ( rule__Property2__Group_2_1__2__Impl )
            // InternalTemporalLogic.g:695:2: rule__Property2__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property2__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__2"


    // $ANTLR start "rule__Property2__Group_2_1__2__Impl"
    // InternalTemporalLogic.g:701:1: rule__Property2__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__Property2__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:705:1: ( ( ')' ) )
            // InternalTemporalLogic.g:706:1: ( ')' )
            {
            // InternalTemporalLogic.g:706:1: ( ')' )
            // InternalTemporalLogic.g:707:2: ')'
            {
             before(grammarAccess.getProperty2Access().getRightParenthesisKeyword_2_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProperty2Access().getRightParenthesisKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__Group_2_1__2__Impl"


    // $ANTLR start "rule__Model__LocationAssignment_0"
    // InternalTemporalLogic.g:717:1: rule__Model__LocationAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:721:1: ( ( ruleImport ) )
            // InternalTemporalLogic.g:722:2: ( ruleImport )
            {
            // InternalTemporalLogic.g:722:2: ( ruleImport )
            // InternalTemporalLogic.g:723:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getLocationImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLocationImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__LocationAssignment_0"


    // $ANTLR start "rule__Model__Property1Assignment_1_0"
    // InternalTemporalLogic.g:732:1: rule__Model__Property1Assignment_1_0 : ( ruleProperty1 ) ;
    public final void rule__Model__Property1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:736:1: ( ( ruleProperty1 ) )
            // InternalTemporalLogic.g:737:2: ( ruleProperty1 )
            {
            // InternalTemporalLogic.g:737:2: ( ruleProperty1 )
            // InternalTemporalLogic.g:738:3: ruleProperty1
            {
             before(grammarAccess.getModelAccess().getProperty1Property1ParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty1();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProperty1Property1ParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Property1Assignment_1_0"


    // $ANTLR start "rule__Model__Property2Assignment_1_1"
    // InternalTemporalLogic.g:747:1: rule__Model__Property2Assignment_1_1 : ( ruleProperty2 ) ;
    public final void rule__Model__Property2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:751:1: ( ( ruleProperty2 ) )
            // InternalTemporalLogic.g:752:2: ( ruleProperty2 )
            {
            // InternalTemporalLogic.g:752:2: ( ruleProperty2 )
            // InternalTemporalLogic.g:753:3: ruleProperty2
            {
             before(grammarAccess.getModelAccess().getProperty2Property2ParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty2();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProperty2Property2ParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Property2Assignment_1_1"


    // $ANTLR start "rule__Import__ModelAssignment_1"
    // InternalTemporalLogic.g:762:1: rule__Import__ModelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:766:1: ( ( RULE_STRING ) )
            // InternalTemporalLogic.g:767:2: ( RULE_STRING )
            {
            // InternalTemporalLogic.g:767:2: ( RULE_STRING )
            // InternalTemporalLogic.g:768:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getModelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getModelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ModelAssignment_1"


    // $ANTLR start "rule__Property1__OperatorAssignment_0"
    // InternalTemporalLogic.g:777:1: rule__Property1__OperatorAssignment_0 : ( ( rule__Property1__OperatorAlternatives_0_0 ) ) ;
    public final void rule__Property1__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:781:1: ( ( ( rule__Property1__OperatorAlternatives_0_0 ) ) )
            // InternalTemporalLogic.g:782:2: ( ( rule__Property1__OperatorAlternatives_0_0 ) )
            {
            // InternalTemporalLogic.g:782:2: ( ( rule__Property1__OperatorAlternatives_0_0 ) )
            // InternalTemporalLogic.g:783:3: ( rule__Property1__OperatorAlternatives_0_0 )
            {
             before(grammarAccess.getProperty1Access().getOperatorAlternatives_0_0()); 
            // InternalTemporalLogic.g:784:3: ( rule__Property1__OperatorAlternatives_0_0 )
            // InternalTemporalLogic.g:784:4: rule__Property1__OperatorAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Property1__OperatorAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getProperty1Access().getOperatorAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__OperatorAssignment_0"


    // $ANTLR start "rule__Property1__ModelElement1Assignment_2_0"
    // InternalTemporalLogic.g:792:1: rule__Property1__ModelElement1Assignment_2_0 : ( RULE_TEST ) ;
    public final void rule__Property1__ModelElement1Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:796:1: ( ( RULE_TEST ) )
            // InternalTemporalLogic.g:797:2: ( RULE_TEST )
            {
            // InternalTemporalLogic.g:797:2: ( RULE_TEST )
            // InternalTemporalLogic.g:798:3: RULE_TEST
            {
             before(grammarAccess.getProperty1Access().getModelElement1TESTTerminalRuleCall_2_0_0()); 
            match(input,RULE_TEST,FOLLOW_2); 
             after(grammarAccess.getProperty1Access().getModelElement1TESTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__ModelElement1Assignment_2_0"


    // $ANTLR start "rule__Property1__NextAssignment_2_1"
    // InternalTemporalLogic.g:807:1: rule__Property1__NextAssignment_2_1 : ( ruleOption ) ;
    public final void rule__Property1__NextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:811:1: ( ( ruleOption ) )
            // InternalTemporalLogic.g:812:2: ( ruleOption )
            {
            // InternalTemporalLogic.g:812:2: ( ruleOption )
            // InternalTemporalLogic.g:813:3: ruleOption
            {
             before(grammarAccess.getProperty1Access().getNextOptionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getProperty1Access().getNextOptionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property1__NextAssignment_2_1"


    // $ANTLR start "rule__Property2__ModelElement1Assignment_0"
    // InternalTemporalLogic.g:822:1: rule__Property2__ModelElement1Assignment_0 : ( RULE_TEST ) ;
    public final void rule__Property2__ModelElement1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:826:1: ( ( RULE_TEST ) )
            // InternalTemporalLogic.g:827:2: ( RULE_TEST )
            {
            // InternalTemporalLogic.g:827:2: ( RULE_TEST )
            // InternalTemporalLogic.g:828:3: RULE_TEST
            {
             before(grammarAccess.getProperty2Access().getModelElement1TESTTerminalRuleCall_0_0()); 
            match(input,RULE_TEST,FOLLOW_2); 
             after(grammarAccess.getProperty2Access().getModelElement1TESTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__ModelElement1Assignment_0"


    // $ANTLR start "rule__Property2__OperatorAssignment_1"
    // InternalTemporalLogic.g:837:1: rule__Property2__OperatorAssignment_1 : ( ( rule__Property2__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Property2__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:841:1: ( ( ( rule__Property2__OperatorAlternatives_1_0 ) ) )
            // InternalTemporalLogic.g:842:2: ( ( rule__Property2__OperatorAlternatives_1_0 ) )
            {
            // InternalTemporalLogic.g:842:2: ( ( rule__Property2__OperatorAlternatives_1_0 ) )
            // InternalTemporalLogic.g:843:3: ( rule__Property2__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getProperty2Access().getOperatorAlternatives_1_0()); 
            // InternalTemporalLogic.g:844:3: ( rule__Property2__OperatorAlternatives_1_0 )
            // InternalTemporalLogic.g:844:4: rule__Property2__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Property2__OperatorAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProperty2Access().getOperatorAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__OperatorAssignment_1"


    // $ANTLR start "rule__Property2__ModelElement2Assignment_2_0"
    // InternalTemporalLogic.g:852:1: rule__Property2__ModelElement2Assignment_2_0 : ( RULE_TEST ) ;
    public final void rule__Property2__ModelElement2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:856:1: ( ( RULE_TEST ) )
            // InternalTemporalLogic.g:857:2: ( RULE_TEST )
            {
            // InternalTemporalLogic.g:857:2: ( RULE_TEST )
            // InternalTemporalLogic.g:858:3: RULE_TEST
            {
             before(grammarAccess.getProperty2Access().getModelElement2TESTTerminalRuleCall_2_0_0()); 
            match(input,RULE_TEST,FOLLOW_2); 
             after(grammarAccess.getProperty2Access().getModelElement2TESTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__ModelElement2Assignment_2_0"


    // $ANTLR start "rule__Property2__NextAssignment_2_1_1"
    // InternalTemporalLogic.g:867:1: rule__Property2__NextAssignment_2_1_1 : ( ruleOption ) ;
    public final void rule__Property2__NextAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemporalLogic.g:871:1: ( ( ruleOption ) )
            // InternalTemporalLogic.g:872:2: ( ruleOption )
            {
            // InternalTemporalLogic.g:872:2: ( ruleOption )
            // InternalTemporalLogic.g:873:3: ruleOption
            {
             before(grammarAccess.getProperty2Access().getNextOptionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getProperty2Access().getNextOptionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property2__NextAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007F020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000007F022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800020L});

}