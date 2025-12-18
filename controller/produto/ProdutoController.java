package projeto_1.controller.produto;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_1.controller.CadastroController;
import projeto_1.model.Produto;

    public class ProdutoController extends CadastroController {
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtEstoque;

    @Override
    protected void configurarTela() {
        view.setTitulo("Cadastro Produto");
       
        JPanel painel = view.getPainelFormulario();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        
        txtDescricao = new JTextField(15);
        txtPreco = new JTextField(15);
        txtEstoque = new JTextField(15);
        
        painel.add(new JLabel("Descricao"));
        painel.add(txtDescricao);
      
        painel.add(new JLabel("Preco"));
        painel.add(txtPreco);
      
        painel.add(new JLabel("Estoque"));
        painel.add(txtEstoque);
     
    }

    @Override
    public void salvar() {
        Produto produto = new Produto(
        txtDescricao.getText(), txtPreco.getText(), txtEstoque.getText());
        
        JOptionPane.showMessageDialog(view, "Funcionario Salvo");
        
        view.fechar();
    }

    @Override
    protected void organizarLayout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

