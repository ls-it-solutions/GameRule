package GameRuleLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.builder.SNodeBuilder;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SConcept;

public class typeof_Condition_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Condition_InferenceRule() {
  }
  public void applyRule(final SNode condition, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    for (SNode constraint : ListSequence.fromList(SLinkOperations.getChildren(condition, LINKS.constraints$ZFBU))) {
      if (!(typeCheckingContext.isSingleTypeComputation())) {
        {
          SNode _nodeToCheck_1029348928467 = constraint;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:cf7c08ca-6b26-4981-a3bd-edcd907b519e(GameRuleLanguage.typesystem)", "5909584729281934951", 0, null);
          typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:cf7c08ca-6b26-4981-a3bd-edcd907b519e(GameRuleLanguage.typesystem)", "5909584729281934957", true), (SNode) _quotation_createNode_lzxzyp_a1a0c0a0a0a0b(), true, true, _info_12389875345);
        }
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = condition;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:cf7c08ca-6b26-4981-a3bd-edcd907b519e(GameRuleLanguage.typesystem)", "5909584729281937990", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:cf7c08ca-6b26-4981-a3bd-edcd907b519e(GameRuleLanguage.typesystem)", "5909584729281938014", true), (SNode) createClassifierType_lzxzyp_a1a0c0b0b(SLinkOperations.getTarget(condition, LINKS.patternType$ZGZ_)), _info_12389875345);
    }


  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.Condition$UC;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_lzxzyp_a1a0c0a0a0a0b() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = new SNodeBuilder(null, null).init(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940d6513eL, "BooleanType")).getResult();
    return quotedNode_1;
  }
  private static SNode createClassifierType_lzxzyp_a1a0c0b0b(SNode node0) {
    SNodeBuilder rootBuilder1 = new SNodeBuilder().init(CONCEPTS.ClassifierType$IZ);
    rootBuilder1.setReferenceTarget(LINKS.classifier$pQ_R, node0);
    return rootBuilder1.getResult();
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink constraints$ZFBU = MetaAdapterFactory.getContainmentLink(0x7243e6ac03d84eb4L, 0x9ecc7a6ffc7a53d2L, 0x520310003ee1f8cdL, 0x520310003ee2df9dL, "constraints");
    /*package*/ static final SReferenceLink patternType$ZGZ_ = MetaAdapterFactory.getReferenceLink(0x7243e6ac03d84eb4L, 0x9ecc7a6ffc7a53d2L, 0x520310003ee1f8cdL, 0x520310003ee2dfd4L, "patternType");
    /*package*/ static final SReferenceLink classifier$pQ_R = MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Condition$UC = MetaAdapterFactory.getConcept(0x7243e6ac03d84eb4L, 0x9ecc7a6ffc7a53d2L, 0x520310003ee1f8cdL, "GameRuleLanguage.structure.Condition");
    /*package*/ static final SConcept ClassifierType$IZ = MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType");
  }
}