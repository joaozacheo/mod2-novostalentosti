package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.controller.FormularioClienteController;
import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;

import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagConstraints;

public class FormularioCliente extends JDialog{
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOk = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(20);
    private JTextField txtNome = new JTextField(20);
    private MaskFormatter mascaraCPF;
    private JFormattedTextField txtCPF;
    private MaskFormatter mascaraDataNasc;
    private JFormattedTextField txtDataNasc;
    private FormularioClienteController controller = new FormularioClienteController(this);
    private Cliente cliente = new Cliente();
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public FormularioCliente(Cliente cliente) {
        this.cliente = cliente;
        setSize(400,300);
        setModal(true);
        criaPaineis(); //NÃO ESQUECE DE CHAMAR O MÉTODO AQUI!!!
        atualizaCampos();
        setVisible(true);
    }

    private void atualizaCampos(){
        if(this.cliente != null){
            txtId.setText(String.valueOf(this.cliente.getId()));
            txtNome.setText(this.cliente.getNome());
            txtCPF.setText(this.cliente.getCPF());
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                txtDataNasc.setText(sdf.format(this.cliente.getDataNascimento()));
            }catch(Exception e){}
        }
    }

    private void criaPaineis(){
        add(jpnBotao, "South");
        btnOk.addActionListener(controller);
        btnOk.setName("btnOK");
        jpnBotao.add(btnOk);
        btnCancelar.addActionListener(controller);
        btnCancelar.setName("btnCancelar");
        jpnBotao.add(btnCancelar);

        jpnCentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;

        add(jpnCentro, "Center");

        cons.gridy = 0; //coluna 0
        cons.gridx = 0; //linha 0
        cons.weightx = 0.30; //largura em percentual
        jpnCentro.add(new JLabel("Código: "),cons);
        cons.gridy = 0; //coluna 0
        cons.gridx = 1; //linha 0
        cons.weightx = 0.70; //largura em percentual
        jpnCentro.add(txtId,cons);

        cons.gridy = 1; //coluna 0
        cons.gridx = 0; //linha 0
        cons.weightx = 0.30; //largura em percentual
        jpnCentro.add(new JLabel("Nome: "),cons);
        cons.gridy = 1; //coluna 0
        cons.gridx = 1; //linha 0
        cons.weightx = 0.70; //largura em percentual
        jpnCentro.add(txtNome,cons);

        cons.gridy = 2; //coluna 0
        cons.gridx = 0; //linha 0
        cons.weightx = 0.30; //largura em percentual
        jpnCentro.add(new JLabel("CPF: "),cons);

        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            txtCPF = new JFormattedTextField(mascaraCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridy = 2; //coluna 0
        cons.gridx = 1; //linha 0
        cons.weightx = 0.70; //largura em percentual
        jpnCentro.add(txtCPF,cons);

        cons.gridy = 3; //coluna 0
        cons.gridx = 0; //linha 0
        cons.weightx = 0.30; //largura em percentual
        jpnCentro.add(new JLabel("Data de Nascimmento: "),cons);

        try {
            mascaraDataNasc = new MaskFormatter("##/##/####");
            txtDataNasc = new JFormattedTextField(mascaraDataNasc);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cons.gridy = 3; //coluna 0
        cons.gridx = 1; //linha 0
        cons.weightx = 0.30; //largura em percentual
        jpnCentro.add(txtDataNasc,cons);
    }

    public Cliente atualiza(Cliente cliente) throws ValorInvalidoException{
        //atualiza com os dados da tela (binding)
        try{
            cliente.setId(Long.parseLong(txtId.getText()));
        }catch(NumberFormatException e){
            throw new ValorInvalidoException("Campo código deve conter números", e, "CODIGO");
        }
        cliente.setNome(txtNome.getText());
        cliente.setCPF(txtCPF.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            cliente.setDataNascimento(sdf.parse(txtDataNasc.getText()));
        } catch (ParseException e){
            throw new ValorInvalidoException("Valor de data inválido", e, "DATA NASCIMENTO");
        }
        return cliente;
    }

}
