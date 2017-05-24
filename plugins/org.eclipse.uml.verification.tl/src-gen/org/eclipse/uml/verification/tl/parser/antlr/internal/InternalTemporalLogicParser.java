package org.eclipse.uml.verification.tl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.uml.verification.tl.services.TemporalLogicGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemporalLogicParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TEST", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'AG'", "'AF'", "'EG'", "'EF'", "'NOT'", "'G'", "'F'", "'('", "')'", "'AND'", "'OR'", "'=>'"
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

        public InternalTemporalLogicParser(TokenStream input, TemporalLogicGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TemporalLogicGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTemporalLogic.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTemporalLogic.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTemporalLogic.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTemporalLogic.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_location_0_0= ruleImport ) )? ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_location_0_0 = null;

        EObject lv_property1_1_0 = null;

        EObject lv_property2_2_0 = null;



        	enterRule();

        try {
            // InternalTemporalLogic.g:77:2: ( ( ( (lv_location_0_0= ruleImport ) )? ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )* ) )
            // InternalTemporalLogic.g:78:2: ( ( (lv_location_0_0= ruleImport ) )? ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )* )
            {
            // InternalTemporalLogic.g:78:2: ( ( (lv_location_0_0= ruleImport ) )? ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )* )
            // InternalTemporalLogic.g:79:3: ( (lv_location_0_0= ruleImport ) )? ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )*
            {
            // InternalTemporalLogic.g:79:3: ( (lv_location_0_0= ruleImport ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTemporalLogic.g:80:4: (lv_location_0_0= ruleImport )
                    {
                    // InternalTemporalLogic.g:80:4: (lv_location_0_0= ruleImport )
                    // InternalTemporalLogic.g:81:5: lv_location_0_0= ruleImport
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getLocationImportParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_location_0_0=ruleImport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"location",
                    						lv_location_0_0,
                    						"org.eclipse.uml.verification.tl.TemporalLogic.Import");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalTemporalLogic.g:98:3: ( ( (lv_property1_1_0= ruleProperty1 ) ) | ( (lv_property2_2_0= ruleProperty2 ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=19)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_TEST) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTemporalLogic.g:99:4: ( (lv_property1_1_0= ruleProperty1 ) )
            	    {
            	    // InternalTemporalLogic.g:99:4: ( (lv_property1_1_0= ruleProperty1 ) )
            	    // InternalTemporalLogic.g:100:5: (lv_property1_1_0= ruleProperty1 )
            	    {
            	    // InternalTemporalLogic.g:100:5: (lv_property1_1_0= ruleProperty1 )
            	    // InternalTemporalLogic.g:101:6: lv_property1_1_0= ruleProperty1
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getProperty1Property1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_property1_1_0=ruleProperty1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"property1",
            	    							lv_property1_1_0,
            	    							"org.eclipse.uml.verification.tl.TemporalLogic.Property1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTemporalLogic.g:119:4: ( (lv_property2_2_0= ruleProperty2 ) )
            	    {
            	    // InternalTemporalLogic.g:119:4: ( (lv_property2_2_0= ruleProperty2 ) )
            	    // InternalTemporalLogic.g:120:5: (lv_property2_2_0= ruleProperty2 )
            	    {
            	    // InternalTemporalLogic.g:120:5: (lv_property2_2_0= ruleProperty2 )
            	    // InternalTemporalLogic.g:121:6: lv_property2_2_0= ruleProperty2
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getProperty2Property2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_property2_2_0=ruleProperty2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"property2",
            	    							lv_property2_2_0,
            	    							"org.eclipse.uml.verification.tl.TemporalLogic.Property2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOption"
    // InternalTemporalLogic.g:143:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalTemporalLogic.g:143:47: (iv_ruleOption= ruleOption EOF )
            // InternalTemporalLogic.g:144:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalTemporalLogic.g:150:1: ruleOption returns [EObject current=null] : (this_Property1_0= ruleProperty1 | this_Property2_1= ruleProperty2 ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Property1_0 = null;

        EObject this_Property2_1 = null;



        	enterRule();

        try {
            // InternalTemporalLogic.g:156:2: ( (this_Property1_0= ruleProperty1 | this_Property2_1= ruleProperty2 ) )
            // InternalTemporalLogic.g:157:2: (this_Property1_0= ruleProperty1 | this_Property2_1= ruleProperty2 )
            {
            // InternalTemporalLogic.g:157:2: (this_Property1_0= ruleProperty1 | this_Property2_1= ruleProperty2 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=19)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_TEST) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTemporalLogic.g:158:3: this_Property1_0= ruleProperty1
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getProperty1ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Property1_0=ruleProperty1();

                    state._fsp--;


                    			current = this_Property1_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:167:3: this_Property2_1= ruleProperty2
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getProperty2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Property2_1=ruleProperty2();

                    state._fsp--;


                    			current = this_Property2_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleImport"
    // InternalTemporalLogic.g:179:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTemporalLogic.g:179:47: (iv_ruleImport= ruleImport EOF )
            // InternalTemporalLogic.g:180:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTemporalLogic.g:186:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_model_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_model_1_0=null;


        	enterRule();

        try {
            // InternalTemporalLogic.g:192:2: ( (otherlv_0= 'import' ( (lv_model_1_0= RULE_STRING ) ) ) )
            // InternalTemporalLogic.g:193:2: (otherlv_0= 'import' ( (lv_model_1_0= RULE_STRING ) ) )
            {
            // InternalTemporalLogic.g:193:2: (otherlv_0= 'import' ( (lv_model_1_0= RULE_STRING ) ) )
            // InternalTemporalLogic.g:194:3: otherlv_0= 'import' ( (lv_model_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTemporalLogic.g:198:3: ( (lv_model_1_0= RULE_STRING ) )
            // InternalTemporalLogic.g:199:4: (lv_model_1_0= RULE_STRING )
            {
            // InternalTemporalLogic.g:199:4: (lv_model_1_0= RULE_STRING )
            // InternalTemporalLogic.g:200:5: lv_model_1_0= RULE_STRING
            {
            lv_model_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_model_1_0, grammarAccess.getImportAccess().getModelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"model",
            						lv_model_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProperty1"
    // InternalTemporalLogic.g:220:1: entryRuleProperty1 returns [EObject current=null] : iv_ruleProperty1= ruleProperty1 EOF ;
    public final EObject entryRuleProperty1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty1 = null;


        try {
            // InternalTemporalLogic.g:220:50: (iv_ruleProperty1= ruleProperty1 EOF )
            // InternalTemporalLogic.g:221:2: iv_ruleProperty1= ruleProperty1 EOF
            {
             newCompositeNode(grammarAccess.getProperty1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty1=ruleProperty1();

            state._fsp--;

             current =iv_ruleProperty1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty1"


    // $ANTLR start "ruleProperty1"
    // InternalTemporalLogic.g:227:1: ruleProperty1 returns [EObject current=null] : ( ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) ) otherlv_1= '(' ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleProperty1() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_operator_0_3=null;
        Token lv_operator_0_4=null;
        Token lv_operator_0_5=null;
        Token lv_operator_0_6=null;
        Token lv_operator_0_7=null;
        Token otherlv_1=null;
        Token lv_modelElement1_2_0=null;
        Token otherlv_4=null;
        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalTemporalLogic.g:233:2: ( ( ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) ) otherlv_1= '(' ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) ) otherlv_4= ')' ) )
            // InternalTemporalLogic.g:234:2: ( ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) ) otherlv_1= '(' ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) ) otherlv_4= ')' )
            {
            // InternalTemporalLogic.g:234:2: ( ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) ) otherlv_1= '(' ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) ) otherlv_4= ')' )
            // InternalTemporalLogic.g:235:3: ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) ) otherlv_1= '(' ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) ) otherlv_4= ')'
            {
            // InternalTemporalLogic.g:235:3: ( ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) ) )
            // InternalTemporalLogic.g:236:4: ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) )
            {
            // InternalTemporalLogic.g:236:4: ( (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' ) )
            // InternalTemporalLogic.g:237:5: (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' )
            {
            // InternalTemporalLogic.g:237:5: (lv_operator_0_1= 'AG' | lv_operator_0_2= 'AF' | lv_operator_0_3= 'EG' | lv_operator_0_4= 'EF' | lv_operator_0_5= 'NOT' | lv_operator_0_6= 'G' | lv_operator_0_7= 'F' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTemporalLogic.g:238:6: lv_operator_0_1= 'AG'
                    {
                    lv_operator_0_1=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_1, grammarAccess.getProperty1Access().getOperatorAGKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:249:6: lv_operator_0_2= 'AF'
                    {
                    lv_operator_0_2=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_2, grammarAccess.getProperty1Access().getOperatorAFKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTemporalLogic.g:260:6: lv_operator_0_3= 'EG'
                    {
                    lv_operator_0_3=(Token)match(input,15,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_3, grammarAccess.getProperty1Access().getOperatorEGKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTemporalLogic.g:271:6: lv_operator_0_4= 'EF'
                    {
                    lv_operator_0_4=(Token)match(input,16,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_4, grammarAccess.getProperty1Access().getOperatorEFKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTemporalLogic.g:282:6: lv_operator_0_5= 'NOT'
                    {
                    lv_operator_0_5=(Token)match(input,17,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_5, grammarAccess.getProperty1Access().getOperatorNOTKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTemporalLogic.g:293:6: lv_operator_0_6= 'G'
                    {
                    lv_operator_0_6=(Token)match(input,18,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_6, grammarAccess.getProperty1Access().getOperatorGKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalTemporalLogic.g:304:6: lv_operator_0_7= 'F'
                    {
                    lv_operator_0_7=(Token)match(input,19,FOLLOW_5); 

                    						newLeafNode(lv_operator_0_7, grammarAccess.getProperty1Access().getOperatorFKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_0_7, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProperty1Access().getLeftParenthesisKeyword_1());
            		
            // InternalTemporalLogic.g:321:3: ( ( (lv_modelElement1_2_0= RULE_TEST ) ) | ( (lv_next_3_0= ruleOption ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TEST) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=22 && LA5_1<=24)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=13 && LA5_0<=19)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTemporalLogic.g:322:4: ( (lv_modelElement1_2_0= RULE_TEST ) )
                    {
                    // InternalTemporalLogic.g:322:4: ( (lv_modelElement1_2_0= RULE_TEST ) )
                    // InternalTemporalLogic.g:323:5: (lv_modelElement1_2_0= RULE_TEST )
                    {
                    // InternalTemporalLogic.g:323:5: (lv_modelElement1_2_0= RULE_TEST )
                    // InternalTemporalLogic.g:324:6: lv_modelElement1_2_0= RULE_TEST
                    {
                    lv_modelElement1_2_0=(Token)match(input,RULE_TEST,FOLLOW_7); 

                    						newLeafNode(lv_modelElement1_2_0, grammarAccess.getProperty1Access().getModelElement1TESTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"modelElement1",
                    							lv_modelElement1_2_0,
                    							"org.eclipse.uml.verification.tl.TemporalLogic.TEST");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:341:4: ( (lv_next_3_0= ruleOption ) )
                    {
                    // InternalTemporalLogic.g:341:4: ( (lv_next_3_0= ruleOption ) )
                    // InternalTemporalLogic.g:342:5: (lv_next_3_0= ruleOption )
                    {
                    // InternalTemporalLogic.g:342:5: (lv_next_3_0= ruleOption )
                    // InternalTemporalLogic.g:343:6: lv_next_3_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getProperty1Access().getNextOptionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_next_3_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProperty1Rule());
                    						}
                    						add(
                    							current,
                    							"next",
                    							lv_next_3_0,
                    							"org.eclipse.uml.verification.tl.TemporalLogic.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProperty1Access().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty1"


    // $ANTLR start "entryRuleProperty2"
    // InternalTemporalLogic.g:369:1: entryRuleProperty2 returns [EObject current=null] : iv_ruleProperty2= ruleProperty2 EOF ;
    public final EObject entryRuleProperty2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty2 = null;


        try {
            // InternalTemporalLogic.g:369:50: (iv_ruleProperty2= ruleProperty2 EOF )
            // InternalTemporalLogic.g:370:2: iv_ruleProperty2= ruleProperty2 EOF
            {
             newCompositeNode(grammarAccess.getProperty2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty2=ruleProperty2();

            state._fsp--;

             current =iv_ruleProperty2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty2"


    // $ANTLR start "ruleProperty2"
    // InternalTemporalLogic.g:376:1: ruleProperty2 returns [EObject current=null] : ( ( (lv_modelElement1_0_0= RULE_TEST ) ) ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) ) ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) ) ) ;
    public final EObject ruleProperty2() throws RecognitionException {
        EObject current = null;

        Token lv_modelElement1_0_0=null;
        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_modelElement2_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_next_4_0 = null;



        	enterRule();

        try {
            // InternalTemporalLogic.g:382:2: ( ( ( (lv_modelElement1_0_0= RULE_TEST ) ) ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) ) ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) ) ) )
            // InternalTemporalLogic.g:383:2: ( ( (lv_modelElement1_0_0= RULE_TEST ) ) ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) ) ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) ) )
            {
            // InternalTemporalLogic.g:383:2: ( ( (lv_modelElement1_0_0= RULE_TEST ) ) ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) ) ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) ) )
            // InternalTemporalLogic.g:384:3: ( (lv_modelElement1_0_0= RULE_TEST ) ) ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) ) ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) )
            {
            // InternalTemporalLogic.g:384:3: ( (lv_modelElement1_0_0= RULE_TEST ) )
            // InternalTemporalLogic.g:385:4: (lv_modelElement1_0_0= RULE_TEST )
            {
            // InternalTemporalLogic.g:385:4: (lv_modelElement1_0_0= RULE_TEST )
            // InternalTemporalLogic.g:386:5: lv_modelElement1_0_0= RULE_TEST
            {
            lv_modelElement1_0_0=(Token)match(input,RULE_TEST,FOLLOW_8); 

            					newLeafNode(lv_modelElement1_0_0, grammarAccess.getProperty2Access().getModelElement1TESTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProperty2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"modelElement1",
            						lv_modelElement1_0_0,
            						"org.eclipse.uml.verification.tl.TemporalLogic.TEST");
            				

            }


            }

            // InternalTemporalLogic.g:402:3: ( ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) ) )
            // InternalTemporalLogic.g:403:4: ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) )
            {
            // InternalTemporalLogic.g:403:4: ( (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' ) )
            // InternalTemporalLogic.g:404:5: (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' )
            {
            // InternalTemporalLogic.g:404:5: (lv_operator_1_1= 'AND' | lv_operator_1_2= 'OR' | lv_operator_1_3= '=>' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTemporalLogic.g:405:6: lv_operator_1_1= 'AND'
                    {
                    lv_operator_1_1=(Token)match(input,22,FOLLOW_9); 

                    						newLeafNode(lv_operator_1_1, grammarAccess.getProperty2Access().getOperatorANDKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty2Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:416:6: lv_operator_1_2= 'OR'
                    {
                    lv_operator_1_2=(Token)match(input,23,FOLLOW_9); 

                    						newLeafNode(lv_operator_1_2, grammarAccess.getProperty2Access().getOperatorORKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty2Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTemporalLogic.g:427:6: lv_operator_1_3= '=>'
                    {
                    lv_operator_1_3=(Token)match(input,24,FOLLOW_9); 

                    						newLeafNode(lv_operator_1_3, grammarAccess.getProperty2Access().getOperatorEqualsSignGreaterThanSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty2Rule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalTemporalLogic.g:440:3: ( ( (lv_modelElement2_2_0= RULE_TEST ) ) | (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TEST) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemporalLogic.g:441:4: ( (lv_modelElement2_2_0= RULE_TEST ) )
                    {
                    // InternalTemporalLogic.g:441:4: ( (lv_modelElement2_2_0= RULE_TEST ) )
                    // InternalTemporalLogic.g:442:5: (lv_modelElement2_2_0= RULE_TEST )
                    {
                    // InternalTemporalLogic.g:442:5: (lv_modelElement2_2_0= RULE_TEST )
                    // InternalTemporalLogic.g:443:6: lv_modelElement2_2_0= RULE_TEST
                    {
                    lv_modelElement2_2_0=(Token)match(input,RULE_TEST,FOLLOW_2); 

                    						newLeafNode(lv_modelElement2_2_0, grammarAccess.getProperty2Access().getModelElement2TESTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProperty2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"modelElement2",
                    							lv_modelElement2_2_0,
                    							"org.eclipse.uml.verification.tl.TemporalLogic.TEST");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemporalLogic.g:460:4: (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' )
                    {
                    // InternalTemporalLogic.g:460:4: (otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')' )
                    // InternalTemporalLogic.g:461:5: otherlv_3= '(' ( (lv_next_4_0= ruleOption ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getProperty2Access().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalTemporalLogic.g:465:5: ( (lv_next_4_0= ruleOption ) )
                    // InternalTemporalLogic.g:466:6: (lv_next_4_0= ruleOption )
                    {
                    // InternalTemporalLogic.g:466:6: (lv_next_4_0= ruleOption )
                    // InternalTemporalLogic.g:467:7: lv_next_4_0= ruleOption
                    {

                    							newCompositeNode(grammarAccess.getProperty2Access().getNextOptionParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_next_4_0=ruleOption();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProperty2Rule());
                    							}
                    							set(
                    								current,
                    								"next",
                    								lv_next_4_0,
                    								"org.eclipse.uml.verification.tl.TemporalLogic.Option");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getProperty2Access().getRightParenthesisKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000FE022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FE020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100020L});

}