package Project.Student_Management._3_StudentTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentTable extends JFrame implements ActionListener {
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;  // Create table without table or column
    Container c;
    private Font HeadFont, font;
    private JLabel titleLabel, idLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField idTf, fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, searchButton, deleteButton, clearButton;

    private String[] columns = {"id", "First Name", "Last Name", "Phone Number", "GPA"};
    private String[] rows = new String[5];


    StudentTable() {
        initComponents();   // Calling initComponents method
    }

    private void initComponents() {
        /*====================This section is for Frame====================*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(780, 690);
        this.setLocationRelativeTo(null);
        this.setTitle(("Student Table"));

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        /*====================This section is for Frame====================*/

        /*====================This section is for Font creation====================*/
        HeadFont = new Font("Acme", Font.BOLD, 36);
        font = new Font("Roboto", Font.PLAIN, 16);
        /*====================This section is for Font creation====================*/

        /*====================This section is for Label adding in container====================*/
        titleLabel = new JLabel("Student Registration");
        titleLabel.setFont(HeadFont);
        titleLabel.setBounds(140, 10, 250, 50);
        c.add(titleLabel);

        idLabel = new JLabel("ID: ");
        idLabel.setFont(font);
        idLabel.setBounds(10, 80, 140, 30);
        c.add(idLabel);

        fnLabel = new JLabel("First Name: ");
        fnLabel.setFont(font);
        fnLabel.setBounds(10, 130, 140, 30);
        c.add(fnLabel);

        lnLabel = new JLabel("Last Name: ");
        lnLabel.setFont(font);
        lnLabel.setBounds(10, 180, 150, 30);
        c.add(lnLabel);

        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setFont(font);
        phoneLabel.setBounds(10, 230, 150, 30);
        c.add(phoneLabel);

        gpaLabel = new JLabel("GPA: ");
        gpaLabel.setFont(font);
        gpaLabel.setBounds(10, 280, 150, 30);
        c.add(gpaLabel);
        /*====================This section is for Label adding in container====================*/

        /*====================This section is for TextField adding in container====================*/
        idTf = new JTextField();
        idTf.setBounds(110, 80, 200, 30);
        idTf.setFont(font);
        c.add(idTf);

        fnTf = new JTextField();
        fnTf.setBounds(110, 130, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        lnTf = new JTextField();
        lnTf.setBounds(110, 180, 200, 30);
        lnTf.setFont(font);
        c.add(lnTf);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 230, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);

        gpaTf = new JTextField();
        gpaTf.setBounds(110, 280, 200, 30);
        gpaTf.setFont(font);
        c.add(gpaTf);
        /*====================This section is for TextField adding in container====================*/

        /*====================This section is for Button adding in container====================*/
        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 100, 30);
        addButton.setFont(font);
        c.add(addButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 130, 100, 30);
        updateButton.setFont(font);
        c.add(updateButton);

        searchButton = new JButton("Search");
        searchButton.setBounds(400, 180, 100, 30);
        searchButton.setFont(font);
        c.add(searchButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 230, 100, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 280, 100, 30);
        clearButton.setFont(font);
        c.add(clearButton);
        /*====================This section is for Button adding in container====================*/

        /*====================This section is for Table Create====================*/
        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 360, 720, 265);
        c.add(scroll);
        /*====================This section is for Table Create====================*/

        /*====================This section is for Add ActionListener in  Button====================*/
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numberofRow = table.getSelectedRow();

                idTf.setText(model.getValueAt(numberofRow, 0).toString());
                fnTf.setText(model.getValueAt(numberofRow, 1).toString());
                lnTf.setText(model.getValueAt(numberofRow, 2).toString());
                phoneTf.setText(model.getValueAt(numberofRow, 3).toString());
                gpaTf.setText(model.getValueAt(numberofRow, 4).toString());

            }
        });
        /*====================This section is for Add ActionListener in  Button====================*/
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // This Action for press Add Button
        if (e.getSource().equals(addButton)) {
            // Assign value of TextField to row for Table
            rows[0] = idTf.getText();
            rows[1] = fnTf.getText();
            rows[2] = lnTf.getText();
            rows[3] = phoneTf.getText();
            rows[4] = gpaTf.getText();

            model.addRow(rows);
        }// This Action for press Clear Button
        else if (e.getSource().equals(clearButton)) {
            idTf.setText("");
            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");
        }// This Action for press Delete Button
        else if (e.getSource().equals(deleteButton)) {
            int numberofRow = table.getSelectedRow();
            if (numberofRow >= 0) {
                model.removeRow(numberofRow);
            } else {
                JOptionPane.showMessageDialog(null, "No row has been selected");
            }
        }// This Action for press Delete Button
        else if (e.getSource().equals(updateButton)) {
            int numberofRow = table.getSelectedRow();

            model.setValueAt(idTf.getText(), numberofRow, 0);
            model.setValueAt(fnTf.getText(), numberofRow, 1);
            model.setValueAt(lnTf.getText(), numberofRow, 2);
            model.setValueAt(phoneTf.getText(), numberofRow, 3);
            model.setValueAt(gpaTf.getText(), numberofRow, 4);
        }
    }

    public static void main(String[] args) {
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
    }
}
