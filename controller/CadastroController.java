package projeto_1.controller;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import projeto_1.view.cadastro.TelaCadastro;

public abstract class CadastroController {
    
    protected TelaCadastro view;
    
    public void setView(TelaCadastro view){
        this.view = view;
        
        configurarTela();
    }
    
    protected void organizarLayout(){
    JPanel painel = view.getPainelFormulario();
    painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS)); 
    }
   
    protected abstract void configurarTela();
    public abstract void salvar();
    
}
