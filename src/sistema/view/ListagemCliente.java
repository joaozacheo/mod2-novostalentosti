package sistema.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import sistema.controller.ListagemClienteController;
import sistema.entity.Cliente;
import sistema.model.TabelaClienteModel;

public class ListagemCliente extends JFrame{
    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");
    private ListagemClienteController controller = new ListagemClienteController(this);
    private TabelaClienteModel tabelaModel = new TabelaClienteModel(controller);
    private JTable tabela = new JTable(tabelaModel);

    public Cliente getCliente(){
        if(tabela.getSelectedRow() > 0){
            return controller.getAllClientes().get(tabela.getSelectedRow());
        }
        return null;
    }

    public ListagemCliente(){
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); //chama o metodo!!!
        setVisible(true);
    }

    public void atualizaTabela(){
        tabelaModel.fireTableDataChanged();
    }

    private void criaPaineis(){
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(jpnSul,"South");
        jpnSul.setBackground(Color.decode("#F03756"));
        //jpnCentro.setBackground(Color.DARK_GRAY);
        //jpnSul.setBackground(Color.YELLOW);
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);
        //Adicionando função no botão
        btnNovo.addActionListener(controller);
        btnNovo.setName("btnNovo");
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");

        jpnCentro = new JScrollPane(tabela);
        jpnCentro.setBackground(Color.decode("#302F2F"));
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(jpnCentro,"Center");
    }

    public JTable getTabela(){
        return tabela;
    }
}
