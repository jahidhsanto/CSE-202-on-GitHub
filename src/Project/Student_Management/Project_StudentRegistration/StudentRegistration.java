package Project.Student_Management.Project_StudentRegistration;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.MessageFormat;

public class StudentRegistration extends JFrame implements ActionListener {
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;  // Create table without table or column
    Container c;
    private Font HeadFont, font;
    private JLabel headingLabel, idLabel, nameLabel, fnameLabel, mnameLabel, genderLabel, contactLabel, emailLabel, addressLabel;
    private JTextField idTf, nameTf, fnameTf, mnameTf, genderTf, contactTf, emailTf, addressTf;
    private JButton addButton, updateButton, printButton, deleteButton, clearButton;

    private String[] columns = {"ID", "Name", "Father's Name", "Mother's Number", "Gender", "Contact", "Email", "Address"};
    private String[] rows = new String[8];

    private JPanel infoPanel, buttonPanel, memberPanel, tablePanel;
    private JTextArea jahid, dipa;

    StudentRegistration() {
        initComponents();   // Calling initComponents method
    }

    private void initComponents() {
        /*====================This section is for Frame====================*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(780, 720);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle(("Student Table"));

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(240, 240, 240));
        /*====================This section is for Frame====================*/

        /*====================This section is for Font creation====================*/
        HeadFont = new Font("Acme", Font.BOLD, 50);
        font = new Font("Roboto", Font.PLAIN, 16);
        /*====================This section is for Font creation====================*/

        /*====================This section is for HEADING====================*/
        headingLabel = new JLabel("Student Registration");
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
        headingLabel.setOpaque(true);
        headingLabel.setBackground(new Color(255, 255, 255));
        headingLabel.setFont(HeadFont);
        headingLabel.setBounds(0, 0, 780, 100);
        c.add(headingLabel);
        /*====================This section is for HEADING====================*/

        /*====================This section is for MemberPanel====================*/
        memberPanel = new JPanel(new GridLayout(2, 1, 20, 10));
        memberPanel.setBounds(457, 120, 270, 270);
        memberPanel.setBorder(BorderFactory.createTitledBorder(null, "Owner_Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Adobe Arabic", 1, 18)));
        c.add(memberPanel);

        jahid = new JTextArea();
        jahid.setFont(new Font("Roboto", Font.PLAIN, 14));
        jahid.setBorder(BorderFactory.createTitledBorder(null, "Md. Jahid Hassan", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Adobe Arabic", 1, 18)));
        jahid.setText(" ID: 201002463\n Section: 201DB\n Batch: 201\n Dept.: CSE\n Green University of Bangladesh");
        jahid.setEditable(true);
        memberPanel.add(jahid);

        dipa = new JTextArea();
        dipa.setFont(new Font("Roboto", Font.PLAIN, 14));
        dipa.setBorder(BorderFactory.createTitledBorder(null, "Dyana Dipa Gomes", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Adobe Arabic", 1, 18)));
        dipa.setText(" ID: 201002480\n Section: 201DB\n Dept.: CSE\n Batch: 201\n Green University of Bangladesh");
        dipa.setEditable(false);
        memberPanel.add(dipa);
        /*====================This section is for MemberPanel====================*/

        /*====================This section is for infoPanel====================*/
        infoPanel = new JPanel(new GridLayout(8, 2, 10, 5));
        infoPanel.setBounds(30, 120, 389, 270);
        infoPanel.setBorder(BorderFactory.createTitledBorder(null, "Student_Information", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Adobe Arabic", 1, 18)));
        c.add(infoPanel);

        idLabel = new JLabel(" ID: ");
        idLabel.setFont(font);
        infoPanel.add(idLabel);
        idTf = new JTextField();
        idTf.setFont(font);
        infoPanel.add(idTf);

        nameLabel = new JLabel(" Name: ");
        nameLabel.setFont(font);
        infoPanel.add(nameLabel);
        nameTf = new JTextField();
        nameTf.setFont(font);
        infoPanel.add(nameTf);

        fnameLabel = new JLabel(" Father's Name: ");
        fnameLabel.setFont(font);
        infoPanel.add(fnameLabel);
        fnameTf = new JTextField();
        fnameTf.setFont(font);
        infoPanel.add(fnameTf);

        mnameLabel = new JLabel(" Mother's Name: ");
        mnameLabel.setFont(font);
        infoPanel.add(mnameLabel);
        mnameTf = new JTextField();
        mnameTf.setFont(font);
        infoPanel.add(mnameTf);

        genderLabel = new JLabel(" Gender: ");
        genderLabel.setFont(font);
        infoPanel.add(genderLabel);

        JPanel radio = new JPanel(new GridLayout(1, 2));
        infoPanel.add(radio);

        JRadioButton male = new JRadioButton("Male");
        radio.add(male);
        JRadioButton female = new JRadioButton("Female");
        radio.add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderTf = new JTextField();
        genderTf.setFont(font);

        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                genderTf.setText("Male");
            }
        });
        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                genderTf.setText("Female");
            }
        });

        contactLabel = new JLabel(" Contact: ");
        contactLabel.setFont(font);
        infoPanel.add(contactLabel);
        contactTf = new JTextField();
        contactTf.setFont(font);
        infoPanel.add(contactTf);

        emailLabel = new JLabel(" Email: ");
        emailLabel.setFont(font);
        infoPanel.add(emailLabel);
        emailTf = new JTextField();
        emailTf.setFont(font);
        infoPanel.add(emailTf);

        addressLabel = new JLabel(" Address: ");
        addressLabel.setFont(font);
        infoPanel.add(addressLabel);
        addressTf = new JTextField();
        addressTf.setFont(font);
        infoPanel.add(addressTf);
        /*====================This section is for infoPanel====================*/

        /*====================This section is for buttonPanel====================*/
        buttonPanel = new JPanel(new GridLayout(1, 5));
        buttonPanel.setBounds(30, 400, 700, 30);
        c.add(buttonPanel);

        addButton = new JButton("Add");
        addButton.setFont(font);
        buttonPanel.add(addButton);

        updateButton = new JButton("Update");
        updateButton.setFont(font);
        buttonPanel.add(updateButton);

        printButton = new JButton("Print");
        printButton.setFont(font);
        buttonPanel.add(printButton);

        deleteButton = new JButton("Delete");
        deleteButton.setFont(font);
        buttonPanel.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(font);
        buttonPanel.add(clearButton);
        /*====================This section is for buttonPanel====================*/

        /*====================This section is for tablePanel====================*/
        tablePanel = new JPanel(new CardLayout());
        tablePanel.setBounds(30, 440, 700, 215);
        c.add(tablePanel);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(new Color(0, 120, 215));
        table.setSelectionForeground(new Color(255, 255, 255));
        table.setGridColor(new Color(128, 128, 128));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(0, 0, 700, 215);
        tablePanel.add(scroll);
        /*====================This section is for tablePanel====================*/

        /*====================This section is for ActionListener====================*/
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        printButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numberofRow = table.getSelectedRow();

                idTf.setText(model.getValueAt(numberofRow, 0).toString());
                nameTf.setText(model.getValueAt(numberofRow, 1).toString());
                fnameTf.setText(model.getValueAt(numberofRow, 2).toString());
                mnameTf.setText(model.getValueAt(numberofRow, 3).toString());
                genderTf.setText(model.getValueAt(numberofRow, 4).toString());
                contactTf.setText(model.getValueAt(numberofRow, 5).toString());
                emailTf.setText(model.getValueAt(numberofRow, 6).toString());
                addressTf.setText(model.getValueAt(numberofRow, 7).toString());
            }
        });
        /*====================This section is for ActionListener====================*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if user press Add button
        if (e.getSource().equals(addButton)) {
            rows[0] = idTf.getText();
            rows[1] = nameTf.getText();
            rows[2] = fnameTf.getText();
            rows[3] = mnameTf.getText();
            rows[4] = genderTf.getText();
            rows[5] = contactTf.getText();
            rows[6] = emailTf.getText();
            rows[7] = addressTf.getText();

            model.addRow(rows);
        }
        // if user press Update button
        else if (e.getSource().equals(updateButton)) {
            int numberofRow = table.getSelectedRow();

            model.setValueAt(idTf.getText(), numberofRow, 0);
            model.setValueAt(nameTf.getText(), numberofRow, 1);
            model.setValueAt(fnameTf.getText(), numberofRow, 2);
            model.setValueAt(mnameTf.getText(), numberofRow, 3);
            model.setValueAt(genderTf.getText(), numberofRow, 4);
            model.setValueAt(contactTf.getText(), numberofRow, 5);
            model.setValueAt(emailTf.getText(), numberofRow, 6);
            model.setValueAt(addressTf.getText(), numberofRow, 7);

        }// if user press Print button
        else if (e.getSource().equals(printButton)) {

            //MessageFormat for=new MessageFormat()
            MessageFormat header = new MessageFormat("Student Information");

            try {
                table.print(JTable.PrintMode.FIT_WIDTH, header, null);
            } catch (Exception ec) {
                JOptionPane.showMessageDialog(rootPane, ec);
            }
        }// if user press Delete button
        else if (e.getSource().equals(deleteButton)) {
            int numberofRow = table.getSelectedRow();
            if (numberofRow >= 0) {
                model.removeRow(numberofRow);
            } else {
                JOptionPane.showMessageDialog(null, "No row has been selected");
            }
        }// if user press Clear button
        else if (e.getSource().equals(clearButton)) {
            idTf.setText("");
            nameTf.setText("");
            fnameTf.setText("");
            mnameTf.setText("");
            genderTf.setText("");
            contactTf.setText("");
            emailTf.setText("");
            addressTf.setText("");
        }
    }

    public static void main(String[] args) {
        StudentRegistration frame = new StudentRegistration();
        frame.setVisible(true);
    }
}
