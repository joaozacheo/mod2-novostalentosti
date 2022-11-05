package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.view.ListagemCliente;

public class ListagemClienteController implements ActionListener{
    private ClienteService service = new ClienteService();
    //private ClienteDAO ClienteDAO = new ClienteDAO();
    private ListagemCliente listagemCliente;

    public ListagemClienteController(ListagemCliente listagemCliente) {
        this.listagemCliente = listagemCliente;
    }

    public ArrayList<Cliente> getAllClientes(){
        return service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
            default:
                JOptionPane.showMessageDialog(null, "ERRO!");
            break;
        }        
        
    }

    private void btnNovoClique(){
        //JOptionPane.showMessageDialog(null, "Botão Novo");
        Cliente novoCliente = new Cliente();
        FormularioCliente formulario = new FormularioCliente(novoCliente);
        service.save(novoCliente);
        listagemCliente.atualizaTabela();
    }

    private void btnAlterarClique(){
        /*JOptionPane.showMessageDialog(null, linhaClicada());
        Cliente mudaCliente = service.getAllClientes().get(linhaClicada());
        FormularioCliente formulario = new FormularioCliente(mudaCliente);
        service.save(mudaCliente);
        listagemCliente.atualizaTabela();*/
       var clienteClicado = listagemCliente.getCliente();
        if(clienteClicado != null){
            FormularioCliente formulario = new FormularioCliente(clienteClicado);
            service.save(clienteClicado);
            listagemCliente.atualizaTabela();
        }
    }

    private void btnExcluirClique(){
        //JOptionPane.showMessageDialog(null, "Botão Excluir");
        var clienteClicado = listagemCliente.getCliente();
        if(clienteClicado != null){
            var numBotao = JOptionPane.showConfirmDialog(null, "Tem certeza que você quer excluir o registro?");
            if(numBotao == 0){
                service.remove(clienteClicado);
                listagemCliente.atualizaTabela();
            }
            listagemCliente.atualizaTabela();
        }
    }
    
}
