package Project.Student_Management._2_StudentTable;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentTable extends JFrame {
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;  // Create table without table or column
    Container c;
    private Font HeadFont, font;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButton;

    private String[] columns = {"First Name", "Last Name", "Phone Number", "GPA"};
    private String[] rows = new String[4];


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

        fnLabel = new JLabel("First Name: ");
        fnLabel.setFont(font);
        fnLabel.setBounds(10, 80, 140, 30);
        c.add(fnLabel);

        lnLabel = new JLabel("Last Name: ");
        lnLabel.setFont(font);
        lnLabel.setBounds(10, 130, 150, 30);
        c.add(lnLabel);

        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setFont(font);
        phoneLabel.setBounds(10, 180, 150, 30);
        c.add(phoneLabel);

        gpaLabel = new JLabel("GPA: ");
        gpaLabel.setFont(font);
        gpaLabel.setBounds(10, 230, 150, 30);
        c.add(gpaLabel);
        /*====================This section is for Label adding in container====================*/

        /*====================This section is for TextField adding in container====================*/
        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        lnTf = new JTextField();
        lnTf.setBounds(110, 130, 200, 30);
        lnTf.setFont(font);
        c.add(lnTf);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 180, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);

        gpaTf = new JTextField();
        gpaTf.setBounds(110, 230, 200, 30);
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

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 180, 100, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 230, 100, 30);
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
    }


    public static void main(String[] args) {
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
    }

}
