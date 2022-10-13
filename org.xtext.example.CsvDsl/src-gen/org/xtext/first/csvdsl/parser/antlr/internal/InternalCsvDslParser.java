package org.xtext.first.csvdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.first.csvdsl.services.CsvDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'Save'", "'('", "','", "')'", "'Print'", "'Open'", "'Sum'", "'Product'", "'.select'", "'.drop'", "'Row:'", "'Rows:'", "'-'", "'Column:'", "'Columns:'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCsvDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCsvDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCsvDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCsvDsl.g"; }



     	private CsvDslGrammarAccess grammarAccess;

        public InternalCsvDslParser(TokenStream input, CsvDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CsvDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCsvDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCsvDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCsvDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalCsvDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statement_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:77:2: ( ( (lv_statement_0_0= ruleStatement ) )* )
            // InternalCsvDsl.g:78:2: ( (lv_statement_0_0= ruleStatement ) )*
            {
            // InternalCsvDsl.g:78:2: ( (lv_statement_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCsvDsl.g:79:3: (lv_statement_0_0= ruleStatement )
            	    {
            	    // InternalCsvDsl.g:79:3: (lv_statement_0_0= ruleStatement )
            	    // InternalCsvDsl.g:80:4: lv_statement_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statement_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statement",
            	    					lv_statement_0_0,
            	    					"org.xtext.first.csvdsl.CsvDsl.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleStatement"
    // InternalCsvDsl.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCsvDsl.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCsvDsl.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCsvDsl.g:107:1: ruleStatement returns [EObject current=null] : (this_Assign_0= ruleAssign | this_Print_1= rulePrint | this_Save_2= ruleSave ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Assign_0 = null;

        EObject this_Print_1 = null;

        EObject this_Save_2 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:113:2: ( (this_Assign_0= ruleAssign | this_Print_1= rulePrint | this_Save_2= ruleSave ) )
            // InternalCsvDsl.g:114:2: (this_Assign_0= ruleAssign | this_Print_1= rulePrint | this_Save_2= ruleSave )
            {
            // InternalCsvDsl.g:114:2: (this_Assign_0= ruleAssign | this_Print_1= rulePrint | this_Save_2= ruleSave )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCsvDsl.g:115:3: this_Assign_0= ruleAssign
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAssignParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assign_0=ruleAssign();

                    state._fsp--;


                    			current = this_Assign_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:124:3: this_Print_1= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_1=rulePrint();

                    state._fsp--;


                    			current = this_Print_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvDsl.g:133:3: this_Save_2= ruleSave
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSaveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Save_2=ruleSave();

                    state._fsp--;


                    			current = this_Save_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleCsvOperation"
    // InternalCsvDsl.g:145:1: entryRuleCsvOperation returns [EObject current=null] : iv_ruleCsvOperation= ruleCsvOperation EOF ;
    public final EObject entryRuleCsvOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvOperation = null;


        try {
            // InternalCsvDsl.g:145:53: (iv_ruleCsvOperation= ruleCsvOperation EOF )
            // InternalCsvDsl.g:146:2: iv_ruleCsvOperation= ruleCsvOperation EOF
            {
             newCompositeNode(grammarAccess.getCsvOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvOperation=ruleCsvOperation();

            state._fsp--;

             current =iv_ruleCsvOperation; 
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
    // $ANTLR end "entryRuleCsvOperation"


    // $ANTLR start "ruleCsvOperation"
    // InternalCsvDsl.g:152:1: ruleCsvOperation returns [EObject current=null] : (this_Load_0= ruleLoad | this_Select_1= ruleSelect | this_Drop_2= ruleDrop ) ;
    public final EObject ruleCsvOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Load_0 = null;

        EObject this_Select_1 = null;

        EObject this_Drop_2 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:158:2: ( (this_Load_0= ruleLoad | this_Select_1= ruleSelect | this_Drop_2= ruleDrop ) )
            // InternalCsvDsl.g:159:2: (this_Load_0= ruleLoad | this_Select_1= ruleSelect | this_Drop_2= ruleDrop )
            {
            // InternalCsvDsl.g:159:2: (this_Load_0= ruleLoad | this_Select_1= ruleSelect | this_Drop_2= ruleDrop )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==11) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==RULE_ID) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==20) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==21) ) {
                            alt3=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsvDsl.g:160:3: this_Load_0= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getCsvOperationAccess().getLoadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_0=ruleLoad();

                    state._fsp--;


                    			current = this_Load_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:169:3: this_Select_1= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getCsvOperationAccess().getSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_1=ruleSelect();

                    state._fsp--;


                    			current = this_Select_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvDsl.g:178:3: this_Drop_2= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getCsvOperationAccess().getDropParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_2=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_2;
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
    // $ANTLR end "ruleCsvOperation"


    // $ANTLR start "entryRuleIntOperation"
    // InternalCsvDsl.g:190:1: entryRuleIntOperation returns [EObject current=null] : iv_ruleIntOperation= ruleIntOperation EOF ;
    public final EObject entryRuleIntOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOperation = null;


        try {
            // InternalCsvDsl.g:190:53: (iv_ruleIntOperation= ruleIntOperation EOF )
            // InternalCsvDsl.g:191:2: iv_ruleIntOperation= ruleIntOperation EOF
            {
             newCompositeNode(grammarAccess.getIntOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOperation=ruleIntOperation();

            state._fsp--;

             current =iv_ruleIntOperation; 
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
    // $ANTLR end "entryRuleIntOperation"


    // $ANTLR start "ruleIntOperation"
    // InternalCsvDsl.g:197:1: ruleIntOperation returns [EObject current=null] : (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Direct_2= ruleDirect ) ;
    public final EObject ruleIntOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;

        EObject this_Product_1 = null;

        EObject this_Direct_2 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:203:2: ( (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Direct_2= ruleDirect ) )
            // InternalCsvDsl.g:204:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Direct_2= ruleDirect )
            {
            // InternalCsvDsl.g:204:2: (this_Sum_0= ruleSum | this_Product_1= ruleProduct | this_Direct_2= ruleDirect )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==11) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==19) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==18) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvDsl.g:205:3: this_Sum_0= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getIntOperationAccess().getSumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_0=ruleSum();

                    state._fsp--;


                    			current = this_Sum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:214:3: this_Product_1= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getIntOperationAccess().getProductParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_1=ruleProduct();

                    state._fsp--;


                    			current = this_Product_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvDsl.g:223:3: this_Direct_2= ruleDirect
                    {

                    			newCompositeNode(grammarAccess.getIntOperationAccess().getDirectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Direct_2=ruleDirect();

                    state._fsp--;


                    			current = this_Direct_2;
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
    // $ANTLR end "ruleIntOperation"


    // $ANTLR start "entryRuleAssign"
    // InternalCsvDsl.g:235:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalCsvDsl.g:235:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalCsvDsl.g:236:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalCsvDsl.g:242:1: ruleAssign returns [EObject current=null] : ( ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) ) | ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_val_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_var_3_0 = null;

        EObject lv_op_5_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:248:2: ( ( ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) ) | ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) ) ) )
            // InternalCsvDsl.g:249:2: ( ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) ) | ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) ) )
            {
            // InternalCsvDsl.g:249:2: ( ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) ) | ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==11) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        alt5=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==11) ) {
                            int LA5_6 = input.LA(5);

                            if ( (LA5_6==RULE_ID) ) {
                                alt5=1;
                            }
                            else if ( ((LA5_6>=18 && LA5_6<=19)) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvDsl.g:250:3: ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) )
                    {
                    // InternalCsvDsl.g:250:3: ( ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) ) )
                    // InternalCsvDsl.g:251:4: ( (lv_val_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_op_2_0= ruleCsvOperation ) )
                    {
                    // InternalCsvDsl.g:251:4: ( (lv_val_0_0= ruleCsv_variable ) )
                    // InternalCsvDsl.g:252:5: (lv_val_0_0= ruleCsv_variable )
                    {
                    // InternalCsvDsl.g:252:5: (lv_val_0_0= ruleCsv_variable )
                    // InternalCsvDsl.g:253:6: lv_val_0_0= ruleCsv_variable
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getValCsv_variableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_val_0_0=ruleCsv_variable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_0_0,
                    							"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalCsvDsl.g:274:4: ( (lv_op_2_0= ruleCsvOperation ) )
                    // InternalCsvDsl.g:275:5: (lv_op_2_0= ruleCsvOperation )
                    {
                    // InternalCsvDsl.g:275:5: (lv_op_2_0= ruleCsvOperation )
                    // InternalCsvDsl.g:276:6: lv_op_2_0= ruleCsvOperation
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getOpCsvOperationParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_op_2_0=ruleCsvOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.xtext.first.csvdsl.CsvDsl.CsvOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:295:3: ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) )
                    {
                    // InternalCsvDsl.g:295:3: ( ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) ) )
                    // InternalCsvDsl.g:296:4: ( (lv_var_3_0= ruleInt_variable ) ) otherlv_4= '=' ( (lv_op_5_0= ruleIntOperation ) )
                    {
                    // InternalCsvDsl.g:296:4: ( (lv_var_3_0= ruleInt_variable ) )
                    // InternalCsvDsl.g:297:5: (lv_var_3_0= ruleInt_variable )
                    {
                    // InternalCsvDsl.g:297:5: (lv_var_3_0= ruleInt_variable )
                    // InternalCsvDsl.g:298:6: lv_var_3_0= ruleInt_variable
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getVarInt_variableParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_var_3_0=ruleInt_variable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_3_0,
                    							"org.xtext.first.csvdsl.CsvDsl.Int_variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,11,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssignAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalCsvDsl.g:319:4: ( (lv_op_5_0= ruleIntOperation ) )
                    // InternalCsvDsl.g:320:5: (lv_op_5_0= ruleIntOperation )
                    {
                    // InternalCsvDsl.g:320:5: (lv_op_5_0= ruleIntOperation )
                    // InternalCsvDsl.g:321:6: lv_op_5_0= ruleIntOperation
                    {

                    						newCompositeNode(grammarAccess.getAssignAccess().getOpIntOperationParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_op_5_0=ruleIntOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_5_0,
                    							"org.xtext.first.csvdsl.CsvDsl.IntOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleSave"
    // InternalCsvDsl.g:343:1: entryRuleSave returns [EObject current=null] : iv_ruleSave= ruleSave EOF ;
    public final EObject entryRuleSave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSave = null;


        try {
            // InternalCsvDsl.g:343:45: (iv_ruleSave= ruleSave EOF )
            // InternalCsvDsl.g:344:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave; 
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
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalCsvDsl.g:350:1: ruleSave returns [EObject current=null] : (otherlv_0= 'Save' otherlv_1= '(' ( (lv_declared_csv_2_0= ruleCsv_variable ) ) otherlv_3= ',' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleSave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_filename_4_0=null;
        Token otherlv_5=null;
        EObject lv_declared_csv_2_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:356:2: ( (otherlv_0= 'Save' otherlv_1= '(' ( (lv_declared_csv_2_0= ruleCsv_variable ) ) otherlv_3= ',' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalCsvDsl.g:357:2: (otherlv_0= 'Save' otherlv_1= '(' ( (lv_declared_csv_2_0= ruleCsv_variable ) ) otherlv_3= ',' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalCsvDsl.g:357:2: (otherlv_0= 'Save' otherlv_1= '(' ( (lv_declared_csv_2_0= ruleCsv_variable ) ) otherlv_3= ',' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalCsvDsl.g:358:3: otherlv_0= 'Save' otherlv_1= '(' ( (lv_declared_csv_2_0= ruleCsv_variable ) ) otherlv_3= ',' ( (lv_filename_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSaveAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCsvDsl.g:366:3: ( (lv_declared_csv_2_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:367:4: (lv_declared_csv_2_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:367:4: (lv_declared_csv_2_0= ruleCsv_variable )
            // InternalCsvDsl.g:368:5: lv_declared_csv_2_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getSaveAccess().getDeclared_csvCsv_variableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_declared_csv_2_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSaveRule());
            					}
            					set(
            						current,
            						"declared_csv",
            						lv_declared_csv_2_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSaveAccess().getCommaKeyword_3());
            		
            // InternalCsvDsl.g:389:3: ( (lv_filename_4_0= RULE_STRING ) )
            // InternalCsvDsl.g:390:4: (lv_filename_4_0= RULE_STRING )
            {
            // InternalCsvDsl.g:390:4: (lv_filename_4_0= RULE_STRING )
            // InternalCsvDsl.g:391:5: lv_filename_4_0= RULE_STRING
            {
            lv_filename_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_filename_4_0, grammarAccess.getSaveAccess().getFilenameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSaveAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRulePrint"
    // InternalCsvDsl.g:415:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalCsvDsl.g:415:46: (iv_rulePrint= rulePrint EOF )
            // InternalCsvDsl.g:416:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalCsvDsl.g:422:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print' otherlv_1= '(' ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) ) otherlv_3= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_val_2_1 = null;

        EObject lv_val_2_2 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:428:2: ( (otherlv_0= 'Print' otherlv_1= '(' ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) ) otherlv_3= ')' ) )
            // InternalCsvDsl.g:429:2: (otherlv_0= 'Print' otherlv_1= '(' ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) ) otherlv_3= ')' )
            {
            // InternalCsvDsl.g:429:2: (otherlv_0= 'Print' otherlv_1= '(' ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) ) otherlv_3= ')' )
            // InternalCsvDsl.g:430:3: otherlv_0= 'Print' otherlv_1= '(' ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCsvDsl.g:438:3: ( ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) ) )
            // InternalCsvDsl.g:439:4: ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) )
            {
            // InternalCsvDsl.g:439:4: ( (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable ) )
            // InternalCsvDsl.g:440:5: (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable )
            {
            // InternalCsvDsl.g:440:5: (lv_val_2_1= ruleIntOperation | lv_val_2_2= ruleInt_variable )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==11) ) {
                    alt6=1;
                }
                else if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCsvDsl.g:441:6: lv_val_2_1= ruleIntOperation
                    {

                    						newCompositeNode(grammarAccess.getPrintAccess().getValIntOperationParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_val_2_1=ruleIntOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_2_1,
                    							"org.xtext.first.csvdsl.CsvDsl.IntOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:457:6: lv_val_2_2= ruleInt_variable
                    {

                    						newCompositeNode(grammarAccess.getPrintAccess().getValInt_variableParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_11);
                    lv_val_2_2=ruleInt_variable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_2_2,
                    							"org.xtext.first.csvdsl.CsvDsl.Int_variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleLoad"
    // InternalCsvDsl.g:483:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalCsvDsl.g:483:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalCsvDsl.g:484:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalCsvDsl.g:490:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Open' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:496:2: ( (otherlv_0= 'Open' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalCsvDsl.g:497:2: (otherlv_0= 'Open' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalCsvDsl.g:497:2: (otherlv_0= 'Open' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalCsvDsl.g:498:3: otherlv_0= 'Open' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getOpenKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCsvDsl.g:506:3: ( (lv_filename_2_0= RULE_STRING ) )
            // InternalCsvDsl.g:507:4: (lv_filename_2_0= RULE_STRING )
            {
            // InternalCsvDsl.g:507:4: (lv_filename_2_0= RULE_STRING )
            // InternalCsvDsl.g:508:5: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_filename_2_0, grammarAccess.getLoadAccess().getFilenameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleSum"
    // InternalCsvDsl.g:532:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalCsvDsl.g:532:44: (iv_ruleSum= ruleSum EOF )
            // InternalCsvDsl.g:533:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalCsvDsl.g:539:1: ruleSum returns [EObject current=null] : ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Sum' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_var_0_0 = null;

        EObject lv_selection_4_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:545:2: ( ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Sum' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' ) )
            // InternalCsvDsl.g:546:2: ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Sum' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' )
            {
            // InternalCsvDsl.g:546:2: ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Sum' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' )
            // InternalCsvDsl.g:547:3: ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Sum' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')'
            {
            // InternalCsvDsl.g:547:3: ( (lv_var_0_0= ruleInt_variable ) )
            // InternalCsvDsl.g:548:4: (lv_var_0_0= ruleInt_variable )
            {
            // InternalCsvDsl.g:548:4: (lv_var_0_0= ruleInt_variable )
            // InternalCsvDsl.g:549:5: lv_var_0_0= ruleInt_variable
            {

            					newCompositeNode(grammarAccess.getSumAccess().getVarInt_variableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_var_0_0=ruleInt_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.first.csvdsl.CsvDsl.Int_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSumAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSumAccess().getSumKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSumAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCsvDsl.g:578:3: ( (lv_selection_4_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:579:4: (lv_selection_4_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:579:4: (lv_selection_4_0= ruleCsv_variable )
            // InternalCsvDsl.g:580:5: lv_selection_4_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getSumAccess().getSelectionCsv_variableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_selection_4_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"selection",
            						lv_selection_4_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSumAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleProduct"
    // InternalCsvDsl.g:605:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalCsvDsl.g:605:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalCsvDsl.g:606:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalCsvDsl.g:612:1: ruleProduct returns [EObject current=null] : ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Product' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_var_0_0 = null;

        EObject lv_selection_4_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:618:2: ( ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Product' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' ) )
            // InternalCsvDsl.g:619:2: ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Product' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' )
            {
            // InternalCsvDsl.g:619:2: ( ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Product' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')' )
            // InternalCsvDsl.g:620:3: ( (lv_var_0_0= ruleInt_variable ) ) otherlv_1= '=' otherlv_2= 'Product' otherlv_3= '(' ( (lv_selection_4_0= ruleCsv_variable ) ) otherlv_5= ')'
            {
            // InternalCsvDsl.g:620:3: ( (lv_var_0_0= ruleInt_variable ) )
            // InternalCsvDsl.g:621:4: (lv_var_0_0= ruleInt_variable )
            {
            // InternalCsvDsl.g:621:4: (lv_var_0_0= ruleInt_variable )
            // InternalCsvDsl.g:622:5: lv_var_0_0= ruleInt_variable
            {

            					newCompositeNode(grammarAccess.getProductAccess().getVarInt_variableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_var_0_0=ruleInt_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.first.csvdsl.CsvDsl.Int_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getProductAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getProductKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getProductAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCsvDsl.g:651:3: ( (lv_selection_4_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:652:4: (lv_selection_4_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:652:4: (lv_selection_4_0= ruleCsv_variable )
            // InternalCsvDsl.g:653:5: lv_selection_4_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getProductAccess().getSelectionCsv_variableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_selection_4_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductRule());
            					}
            					set(
            						current,
            						"selection",
            						lv_selection_4_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProductAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRuleDirect"
    // InternalCsvDsl.g:678:1: entryRuleDirect returns [EObject current=null] : iv_ruleDirect= ruleDirect EOF ;
    public final EObject entryRuleDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirect = null;


        try {
            // InternalCsvDsl.g:678:47: (iv_ruleDirect= ruleDirect EOF )
            // InternalCsvDsl.g:679:2: iv_ruleDirect= ruleDirect EOF
            {
             newCompositeNode(grammarAccess.getDirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirect=ruleDirect();

            state._fsp--;

             current =iv_ruleDirect; 
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
    // $ANTLR end "entryRuleDirect"


    // $ANTLR start "ruleDirect"
    // InternalCsvDsl.g:685:1: ruleDirect returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleDirect() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:691:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalCsvDsl.g:692:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalCsvDsl.g:692:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalCsvDsl.g:693:3: (lv_val_0_0= RULE_INT )
            {
            // InternalCsvDsl.g:693:3: (lv_val_0_0= RULE_INT )
            // InternalCsvDsl.g:694:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getDirectAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDirectRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleDirect"


    // $ANTLR start "entryRuleSelect"
    // InternalCsvDsl.g:713:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalCsvDsl.g:713:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalCsvDsl.g:714:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalCsvDsl.g:720:1: ruleSelect returns [EObject current=null] : ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.select' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_newCsv_0_0 = null;

        EObject lv_csv_var_2_0 = null;

        EObject lv_range_5_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:726:2: ( ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.select' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' ) )
            // InternalCsvDsl.g:727:2: ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.select' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' )
            {
            // InternalCsvDsl.g:727:2: ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.select' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' )
            // InternalCsvDsl.g:728:3: ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.select' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')'
            {
            // InternalCsvDsl.g:728:3: ( (lv_newCsv_0_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:729:4: (lv_newCsv_0_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:729:4: (lv_newCsv_0_0= ruleCsv_variable )
            // InternalCsvDsl.g:730:5: lv_newCsv_0_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getNewCsvCsv_variableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_newCsv_0_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"newCsv",
            						lv_newCsv_0_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getEqualsSignKeyword_1());
            		
            // InternalCsvDsl.g:751:3: ( (lv_csv_var_2_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:752:4: (lv_csv_var_2_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:752:4: (lv_csv_var_2_0= ruleCsv_variable )
            // InternalCsvDsl.g:753:5: lv_csv_var_2_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getCsv_varCsv_variableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_csv_var_2_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"csv_var",
            						lv_csv_var_2_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getSelectKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCsvDsl.g:778:3: ( (lv_range_5_0= ruleRange ) )
            // InternalCsvDsl.g:779:4: (lv_range_5_0= ruleRange )
            {
            // InternalCsvDsl.g:779:4: (lv_range_5_0= ruleRange )
            // InternalCsvDsl.g:780:5: lv_range_5_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getRangeRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_range_5_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_5_0,
            						"org.xtext.first.csvdsl.CsvDsl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleDrop"
    // InternalCsvDsl.g:805:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalCsvDsl.g:805:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalCsvDsl.g:806:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
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
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalCsvDsl.g:812:1: ruleDrop returns [EObject current=null] : ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.drop' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_newCsv_0_0 = null;

        EObject lv_csv_var_2_0 = null;

        EObject lv_range_5_0 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:818:2: ( ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.drop' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' ) )
            // InternalCsvDsl.g:819:2: ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.drop' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' )
            {
            // InternalCsvDsl.g:819:2: ( ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.drop' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')' )
            // InternalCsvDsl.g:820:3: ( (lv_newCsv_0_0= ruleCsv_variable ) ) otherlv_1= '=' ( (lv_csv_var_2_0= ruleCsv_variable ) ) otherlv_3= '.drop' otherlv_4= '(' ( (lv_range_5_0= ruleRange ) ) otherlv_6= ')'
            {
            // InternalCsvDsl.g:820:3: ( (lv_newCsv_0_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:821:4: (lv_newCsv_0_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:821:4: (lv_newCsv_0_0= ruleCsv_variable )
            // InternalCsvDsl.g:822:5: lv_newCsv_0_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getDropAccess().getNewCsvCsv_variableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_newCsv_0_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropRule());
            					}
            					set(
            						current,
            						"newCsv",
            						lv_newCsv_0_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDropAccess().getEqualsSignKeyword_1());
            		
            // InternalCsvDsl.g:843:3: ( (lv_csv_var_2_0= ruleCsv_variable ) )
            // InternalCsvDsl.g:844:4: (lv_csv_var_2_0= ruleCsv_variable )
            {
            // InternalCsvDsl.g:844:4: (lv_csv_var_2_0= ruleCsv_variable )
            // InternalCsvDsl.g:845:5: lv_csv_var_2_0= ruleCsv_variable
            {

            					newCompositeNode(grammarAccess.getDropAccess().getCsv_varCsv_variableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_csv_var_2_0=ruleCsv_variable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropRule());
            					}
            					set(
            						current,
            						"csv_var",
            						lv_csv_var_2_0,
            						"org.xtext.first.csvdsl.CsvDsl.Csv_variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDropAccess().getDropKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getDropAccess().getLeftParenthesisKeyword_4());
            		
            // InternalCsvDsl.g:870:3: ( (lv_range_5_0= ruleRange ) )
            // InternalCsvDsl.g:871:4: (lv_range_5_0= ruleRange )
            {
            // InternalCsvDsl.g:871:4: (lv_range_5_0= ruleRange )
            // InternalCsvDsl.g:872:5: lv_range_5_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getDropAccess().getRangeRangeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_range_5_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_5_0,
            						"org.xtext.first.csvdsl.CsvDsl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDropAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleRange"
    // InternalCsvDsl.g:897:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalCsvDsl.g:897:46: (iv_ruleRange= ruleRange EOF )
            // InternalCsvDsl.g:898:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalCsvDsl.g:904:1: ruleRange returns [EObject current=null] : (this_RowRange_0= ruleRowRange | this_ColRange_1= ruleColRange ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        EObject this_RowRange_0 = null;

        EObject this_ColRange_1 = null;



        	enterRule();

        try {
            // InternalCsvDsl.g:910:2: ( (this_RowRange_0= ruleRowRange | this_ColRange_1= ruleColRange ) )
            // InternalCsvDsl.g:911:2: (this_RowRange_0= ruleRowRange | this_ColRange_1= ruleColRange )
            {
            // InternalCsvDsl.g:911:2: (this_RowRange_0= ruleRowRange | this_ColRange_1= ruleColRange )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCsvDsl.g:912:3: this_RowRange_0= ruleRowRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getRowRangeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RowRange_0=ruleRowRange();

                    state._fsp--;


                    			current = this_RowRange_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:921:3: this_ColRange_1= ruleColRange
                    {

                    			newCompositeNode(grammarAccess.getRangeAccess().getColRangeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColRange_1=ruleColRange();

                    state._fsp--;


                    			current = this_ColRange_1;
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleRowRange"
    // InternalCsvDsl.g:933:1: entryRuleRowRange returns [EObject current=null] : iv_ruleRowRange= ruleRowRange EOF ;
    public final EObject entryRuleRowRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowRange = null;


        try {
            // InternalCsvDsl.g:933:49: (iv_ruleRowRange= ruleRowRange EOF )
            // InternalCsvDsl.g:934:2: iv_ruleRowRange= ruleRowRange EOF
            {
             newCompositeNode(grammarAccess.getRowRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRowRange=ruleRowRange();

            state._fsp--;

             current =iv_ruleRowRange; 
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
    // $ANTLR end "entryRuleRowRange"


    // $ANTLR start "ruleRowRange"
    // InternalCsvDsl.g:940:1: ruleRowRange returns [EObject current=null] : ( (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) ) | (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleRowRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_row_1_0=null;
        Token otherlv_2=null;
        Token lv_rowStart_3_0=null;
        Token otherlv_4=null;
        Token lv_rowEnd_5_0=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:946:2: ( ( (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) ) | (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) ) ) )
            // InternalCsvDsl.g:947:2: ( (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) ) | (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) ) )
            {
            // InternalCsvDsl.g:947:2: ( (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) ) | (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvDsl.g:948:3: (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) )
                    {
                    // InternalCsvDsl.g:948:3: (otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) ) )
                    // InternalCsvDsl.g:949:4: otherlv_0= 'Row:' ( (lv_row_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getRowRangeAccess().getRowKeyword_0_0());
                    			
                    // InternalCsvDsl.g:953:4: ( (lv_row_1_0= RULE_INT ) )
                    // InternalCsvDsl.g:954:5: (lv_row_1_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:954:5: (lv_row_1_0= RULE_INT )
                    // InternalCsvDsl.g:955:6: lv_row_1_0= RULE_INT
                    {
                    lv_row_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_row_1_0, grammarAccess.getRowRangeAccess().getRowINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRowRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"row",
                    							lv_row_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:973:3: (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) )
                    {
                    // InternalCsvDsl.g:973:3: (otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) ) )
                    // InternalCsvDsl.g:974:4: otherlv_2= 'Rows:' ( (lv_rowStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_rowEnd_5_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getRowRangeAccess().getRowsKeyword_1_0());
                    			
                    // InternalCsvDsl.g:978:4: ( (lv_rowStart_3_0= RULE_INT ) )
                    // InternalCsvDsl.g:979:5: (lv_rowStart_3_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:979:5: (lv_rowStart_3_0= RULE_INT )
                    // InternalCsvDsl.g:980:6: lv_rowStart_3_0= RULE_INT
                    {
                    lv_rowStart_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_rowStart_3_0, grammarAccess.getRowRangeAccess().getRowStartINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRowRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rowStart",
                    							lv_rowStart_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getRowRangeAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalCsvDsl.g:1000:4: ( (lv_rowEnd_5_0= RULE_INT ) )
                    // InternalCsvDsl.g:1001:5: (lv_rowEnd_5_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:1001:5: (lv_rowEnd_5_0= RULE_INT )
                    // InternalCsvDsl.g:1002:6: lv_rowEnd_5_0= RULE_INT
                    {
                    lv_rowEnd_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_rowEnd_5_0, grammarAccess.getRowRangeAccess().getRowEndINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRowRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rowEnd",
                    							lv_rowEnd_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleRowRange"


    // $ANTLR start "entryRuleColRange"
    // InternalCsvDsl.g:1023:1: entryRuleColRange returns [EObject current=null] : iv_ruleColRange= ruleColRange EOF ;
    public final EObject entryRuleColRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColRange = null;


        try {
            // InternalCsvDsl.g:1023:49: (iv_ruleColRange= ruleColRange EOF )
            // InternalCsvDsl.g:1024:2: iv_ruleColRange= ruleColRange EOF
            {
             newCompositeNode(grammarAccess.getColRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColRange=ruleColRange();

            state._fsp--;

             current =iv_ruleColRange; 
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
    // $ANTLR end "entryRuleColRange"


    // $ANTLR start "ruleColRange"
    // InternalCsvDsl.g:1030:1: ruleColRange returns [EObject current=null] : ( (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) ) | (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleColRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_column_1_0=null;
        Token otherlv_2=null;
        Token lv_columnStart_3_0=null;
        Token otherlv_4=null;
        Token lv_columnEnd_5_0=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:1036:2: ( ( (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) ) | (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) ) ) )
            // InternalCsvDsl.g:1037:2: ( (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) ) | (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) ) )
            {
            // InternalCsvDsl.g:1037:2: ( (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) ) | (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCsvDsl.g:1038:3: (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) )
                    {
                    // InternalCsvDsl.g:1038:3: (otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) ) )
                    // InternalCsvDsl.g:1039:4: otherlv_0= 'Column:' ( (lv_column_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getColRangeAccess().getColumnKeyword_0_0());
                    			
                    // InternalCsvDsl.g:1043:4: ( (lv_column_1_0= RULE_INT ) )
                    // InternalCsvDsl.g:1044:5: (lv_column_1_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:1044:5: (lv_column_1_0= RULE_INT )
                    // InternalCsvDsl.g:1045:6: lv_column_1_0= RULE_INT
                    {
                    lv_column_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_column_1_0, grammarAccess.getColRangeAccess().getColumnINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"column",
                    							lv_column_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCsvDsl.g:1063:3: (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) )
                    {
                    // InternalCsvDsl.g:1063:3: (otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) ) )
                    // InternalCsvDsl.g:1064:4: otherlv_2= 'Columns:' ( (lv_columnStart_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_columnEnd_5_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getColRangeAccess().getColumnsKeyword_1_0());
                    			
                    // InternalCsvDsl.g:1068:4: ( (lv_columnStart_3_0= RULE_INT ) )
                    // InternalCsvDsl.g:1069:5: (lv_columnStart_3_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:1069:5: (lv_columnStart_3_0= RULE_INT )
                    // InternalCsvDsl.g:1070:6: lv_columnStart_3_0= RULE_INT
                    {
                    lv_columnStart_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_columnStart_3_0, grammarAccess.getColRangeAccess().getColumnStartINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"columnStart",
                    							lv_columnStart_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getColRangeAccess().getHyphenMinusKeyword_1_2());
                    			
                    // InternalCsvDsl.g:1090:4: ( (lv_columnEnd_5_0= RULE_INT ) )
                    // InternalCsvDsl.g:1091:5: (lv_columnEnd_5_0= RULE_INT )
                    {
                    // InternalCsvDsl.g:1091:5: (lv_columnEnd_5_0= RULE_INT )
                    // InternalCsvDsl.g:1092:6: lv_columnEnd_5_0= RULE_INT
                    {
                    lv_columnEnd_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_columnEnd_5_0, grammarAccess.getColRangeAccess().getColumnEndINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"columnEnd",
                    							lv_columnEnd_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleColRange"


    // $ANTLR start "entryRuleCsv_variable"
    // InternalCsvDsl.g:1113:1: entryRuleCsv_variable returns [EObject current=null] : iv_ruleCsv_variable= ruleCsv_variable EOF ;
    public final EObject entryRuleCsv_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsv_variable = null;


        try {
            // InternalCsvDsl.g:1113:53: (iv_ruleCsv_variable= ruleCsv_variable EOF )
            // InternalCsvDsl.g:1114:2: iv_ruleCsv_variable= ruleCsv_variable EOF
            {
             newCompositeNode(grammarAccess.getCsv_variableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsv_variable=ruleCsv_variable();

            state._fsp--;

             current =iv_ruleCsv_variable; 
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
    // $ANTLR end "entryRuleCsv_variable"


    // $ANTLR start "ruleCsv_variable"
    // InternalCsvDsl.g:1120:1: ruleCsv_variable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCsv_variable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:1126:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCsvDsl.g:1127:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCsvDsl.g:1127:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCsvDsl.g:1128:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCsvDsl.g:1128:3: (lv_name_0_0= RULE_ID )
            // InternalCsvDsl.g:1129:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCsv_variableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCsv_variableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleCsv_variable"


    // $ANTLR start "entryRuleInt_variable"
    // InternalCsvDsl.g:1148:1: entryRuleInt_variable returns [EObject current=null] : iv_ruleInt_variable= ruleInt_variable EOF ;
    public final EObject entryRuleInt_variable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt_variable = null;


        try {
            // InternalCsvDsl.g:1148:53: (iv_ruleInt_variable= ruleInt_variable EOF )
            // InternalCsvDsl.g:1149:2: iv_ruleInt_variable= ruleInt_variable EOF
            {
             newCompositeNode(grammarAccess.getInt_variableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt_variable=ruleInt_variable();

            state._fsp--;

             current =iv_ruleInt_variable; 
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
    // $ANTLR end "entryRuleInt_variable"


    // $ANTLR start "ruleInt_variable"
    // InternalCsvDsl.g:1155:1: ruleInt_variable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInt_variable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCsvDsl.g:1161:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCsvDsl.g:1162:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCsvDsl.g:1162:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCsvDsl.g:1163:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCsvDsl.g:1163:3: (lv_name_0_0= RULE_ID )
            // InternalCsvDsl.g:1164:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInt_variableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInt_variableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleInt_variable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}