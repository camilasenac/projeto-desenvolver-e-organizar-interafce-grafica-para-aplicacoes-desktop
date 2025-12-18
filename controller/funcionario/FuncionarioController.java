package projeto_1.controller.funcionario;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projeto_1.controller.CadastroController;
import projeto_1.model.Funcionario;

public class FuncionarioController extends CadastroController{
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtCargo;
    private JTextField txtSalario;    

    @Override
    protected void configurarTela() {
        view.setTitulo("Cadastro Funcionario");
       
        JPanel painel = view.getPainelFormulario();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        
        txtNome = new JTextField(15);
        txtCpf = new JTextField(15);
        txtCargo = new JTextField(15);
        txtSalario = new JTextField(15);
        
        painel.add(new JLabel("Nome"));
        painel.add(txtNome);
      
        painel.add(new JLabel("Cpf"));
        painel.add(txtCpf);
      
        painel.add(new JLabel("Cargo"));
        painel.add(txtCargo);
     
        painel.add(new JLabel("Salario"));
        painel.add(txtSalario);
    }

    @Override
    public void salvar() {
        Funcionario funcionario = new Funcionario(
        txtNome.getText(), txtCpf.getText(),
        txtCargo.getText(), txtSalario.getText());
        
        JOptionPane.showMessageDialog(view, "Funcionario Salvo");
        
        view.fechar();
    }

    @Override
    protected void organizarLayout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
