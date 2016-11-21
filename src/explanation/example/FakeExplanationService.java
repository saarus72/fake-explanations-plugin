package explanation.example;

import org.protege.editor.owl.ui.explanation.ExplanationResult;
import org.protege.editor.owl.ui.explanation.ExplanationService;
import org.semanticweb.owlapi.model.OWLAxiom;

public class FakeExplanationService extends ExplanationService {
	
    @Override
    public void initialise() throws Exception {
    }

    @Override
    public boolean hasExplanation(OWLAxiom axiom) {
        return true;
    }

    @Override
    public ExplanationResult explain(OWLAxiom entailment) {
        return new FakePanelExplanationResult();
    }

    public void dispose() throws Exception {

    }
}
