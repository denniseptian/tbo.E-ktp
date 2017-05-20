package grapicalinterfaces;


import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import datas.penduduk;
import system.InputDataPenduduk;

public class FrameArrayList extends javax.swing.JFrame {

	private JFrame frame;
	private JPanel panel2;
	private JPanel panel1;
	private JTextField textFieldNik;
	private JTextField textFieldNama;
	private JTextField textFieldTmptLahir;
	private JTextField textFieldTglLahir;
	//private JTextField textField_4;
	private String jenisKelamin;
	private JTextField textFieldRtRw;
	private JTextField textFieldDesa;
	private JTextField textFieldKecamatan;
	private JComboBox comboBoxAgama;
	private JComboBox comboBoxStts;
	private JComboBox comboBoxPkerjaan;
	private JComboBox comboBoxKwarga;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
					
					FrameArrayList window = new FrameArrayList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	DefaultTableModel modelpenduduk;
	InputDataPenduduk datapenduduk;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldAlamat;
	private JTable table_1;
	
	public FrameArrayList() {
		initialize();
//		initComponents();
		datapenduduk = new InputDataPenduduk();
		viewDataTabel();
	}
	
	public final void viewDataTabel(){
        String [] namakolom = {"NIK", "Nama", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin", "Alamat", "RT/RW", "Desa", "Kecamatan", "Agama", "Status", "Pekerjaan", "Kwarganegaraan"};
        Object [] [] objekpenduduk = new Object[datapenduduk.getALL().size()] [12];
        int i = 0;
        for (penduduk pdd: datapenduduk.getALL()) { 
            String arrayPenduduk[] = {
                pdd.getNIK(),
                pdd.getNama(), 
                pdd.getTptLahir(),
                pdd.getTglLahir(),
                pdd.getJnsKelamin(), 
                pdd.getAlamat(),
                pdd.getRt(),
                pdd.getDesa(), 
                pdd.getKecamatan(),
                pdd.getAgama(),
                pdd.getStatus(), 
                pdd.getPekerjaan(),
                pdd.getKwarganegaraan()
            };
            objekpenduduk[i] = arrayPenduduk;
            i++;
        }
        modelpenduduk = new DefaultTableModel(objekpenduduk, namakolom);
        table.setModel(modelpenduduk);
    }
	public final void viewDataTabelShort(ArrayList<penduduk> array){
		ArrayList<penduduk> data = new ArrayList<penduduk>();
		data.addAll(datapenduduk.dataShort("nik"));
        String [] namakolom = {"NIK", "Nama", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin", "Alamat", "RT/RW", "Desa", "Kecamatan", "Agama", "Status", "Pekerjaan", "Kwarganegaraan"};
        Object [] [] objekpenduduk = new Object[datapenduduk.getALL().size()] [12];
        int i = 0;
        for (penduduk pdd: array) { 
            String arrayPenduduk[] = {
                pdd.getNIK(),
                pdd.getNama(), 
                pdd.getTptLahir(),
                pdd.getTglLahir(),
                pdd.getJnsKelamin(), 
                pdd.getAlamat(),
                pdd.getRt(),
                pdd.getDesa(), 
                pdd.getKecamatan(),
                pdd.getAgama(),
                pdd.getStatus(), 
                pdd.getPekerjaan(),
                pdd.getKwarganegaraan()
            };
            objekpenduduk[i] = arrayPenduduk;
            i++;
        }
        modelpenduduk = new DefaultTableModel(objekpenduduk, namakolom);
        table.setModel(modelpenduduk);
    }
	
 
    public void ClearTextField(){
    	textFieldNik.setText("");
    	textFieldNama.setText("");
        textFieldTmptLahir.setText("");
        textFieldTglLahir.setText("");
        textFieldAlamat.setText("");
        textFieldRtRw.setText("");
        textFieldDesa.setText("");
        textFieldKecamatan.setText("");
    }
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 909, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		frame.getContentPane().add(panel1, "name_38676190739508");
		
		JButton btnPnanel = new JButton("Panel 1");
		btnPnanel.setBounds(44, 381, 89, 23);
		btnPnanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		panel1.setLayout(null);
		panel1.add(btnPnanel);
		
		JButton btnHapus = new JButton("HAPUS");
		btnHapus.setBounds(161, 381, 89, 23);
		panel1.add(btnHapus);
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datapenduduk.deleteData(table.getSelectedRow());
				viewDataTabel();
			}
		});
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		//panel2.add(table);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 893, 370);
		panel1.add(scrollPane);
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
		    @Override
		    public void mouseClicked(java.awt.event.MouseEvent e) {
		       //int row = table.rowAtPoint(e.getPoint());
		        int column = table.columnAtPoint(e.getPoint());
		        if (column == 0 ) {
		        	ArrayList<penduduk> data = new ArrayList<penduduk>();
					
					data.addAll(datapenduduk.dataShort("nik"));
					
					viewDataTabelShort(data);
		        }else if(column == 1){
		        	ArrayList<penduduk> data = new ArrayList<penduduk>();
					
					data.addAll(datapenduduk.dataShort("nama"));
					
					viewDataTabelShort(data);
		        }else if(column == 2){
		        	ArrayList<penduduk> data = new ArrayList<penduduk>();
					
					data.addAll(datapenduduk.dataShort("tempatlahir"));
					
					viewDataTabelShort(data);
		        }
		        System.out.println(column);
		    }
		    
		});
		
		JButton btnShort = new JButton("Short");
		btnShort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Anda dapat shorting dengan klick tabelnya");
			}
		});
		btnShort.setBounds(260, 381, 89, 23);
		panel1.add(btnShort);
		
		panel2 = new JPanel();
		frame.getContentPane().add(panel2, "name_38676174320609");
		panel2.setLayout(null);
		
		JLabel lblNik = new JLabel("NIK");
		lblNik.setBounds(31, 52, 46, 14);
		panel2.add(lblNik);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(31, 84, 46, 14);
		panel2.add(lblNama);
		
		textFieldNama = new JTextField();
		textFieldNama.setBounds(134, 80, 231, 23);
		panel2.add(textFieldNama);
		textFieldNama.setColumns(10);
		
		JLabel lblTempatLahir = new JLabel("Tempat Lahir");
		lblTempatLahir.setBounds(31, 118, 104, 14);
		panel2.add(lblTempatLahir);
		
		textFieldTmptLahir = new JTextField();
		textFieldTmptLahir.setBounds(134, 114, 231, 23);
		panel2.add(textFieldTmptLahir);
		textFieldTmptLahir.setColumns(10);
		
		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
		lblTanggalLahir.setBounds(31, 149, 104, 14);
		panel2.add(lblTanggalLahir);
		
		textFieldTglLahir = new JTextField();
		textFieldTglLahir.setBounds(134, 145, 231, 23);
		panel2.add(textFieldTglLahir);
		textFieldTglLahir.setColumns(10);
		
		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
		lblJenisKelamin.setBounds(31, 194, 104, 14);
		panel2.add(lblJenisKelamin);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setBounds(31, 240, 64, 14);
		panel2.add(lblAlamat);
		
		textFieldAlamat = new JTextField();
		textFieldAlamat.setBounds(134, 236, 231, 23);
		panel2.add(textFieldAlamat);
		textFieldAlamat.setColumns(10);
		
		JLabel lblRtrw = new JLabel("RT/RW");
		lblRtrw.setBounds(31, 274, 46, 14);
		panel2.add(lblRtrw);
		
		textFieldRtRw = new JTextField();
		textFieldRtRw.setBounds(134, 270, 231, 23);
		panel2.add(textFieldRtRw);
		textFieldRtRw.setColumns(10);
		
		textFieldDesa = new JTextField();
		textFieldDesa.setBounds(134, 304, 231, 23);
		panel2.add(textFieldDesa);
		textFieldDesa.setColumns(10);
		
		textFieldKecamatan = new JTextField();
		textFieldKecamatan.setBounds(134, 336, 231, 23);
		panel2.add(textFieldKecamatan);
		textFieldKecamatan.setColumns(10);
		
		JLabel lblAgama = new JLabel("Agama");
		lblAgama.setBounds(504, 52, 64, 14);
		panel2.add(lblAgama);
		
		comboBoxAgama = new JComboBox();
		comboBoxAgama.setBounds(620, 48, 231, 23);
		panel2.add(comboBoxAgama);
		comboBoxAgama.setModel(new DefaultComboBoxModel(new String[] {"Islam", "Kristen", "Hindu"}));
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(504, 84, 64, 14);
		panel2.add(lblStatus);
		
		comboBoxStts = new JComboBox();
		comboBoxStts.setBounds(620, 84, 231, 23);
		panel2.add(comboBoxStts);
		comboBoxStts.setModel(new DefaultComboBoxModel(new String[] {"Menikah", "Belum Menikah"}));
		
		JLabel lblPekerjaan = new JLabel("Pekerjaan");
		lblPekerjaan.setBounds(504, 118, 64, 14);
		panel2.add(lblPekerjaan);
		
		comboBoxPkerjaan= new JComboBox();
		comboBoxPkerjaan.setBounds(620, 118, 231, 23);
		panel2.add(comboBoxPkerjaan);
		comboBoxPkerjaan.setModel(new DefaultComboBoxModel(new String[] {"Belum/Tidak Bekerja", "Mengurus Rumah Tangga", "Pelajar/Mahasiswa", "Karyawan", "Pensiunan", "Pegawai Negeri Sipil", "Pedagang", "Perangkat Desa", "Wiraswasta"}));
		
		JLabel lblKewarganegaraan = new JLabel("Kewarganegaraan");
		lblKewarganegaraan.setBounds(504, 156, 104, 14);
		panel2.add(lblKewarganegaraan);
		
		comboBoxKwarga = new JComboBox();
		comboBoxKwarga.setBounds(620, 152, 231, 23);
		panel2.add(comboBoxKwarga);
		comboBoxKwarga.setModel(new DefaultComboBoxModel(new String[] {"Warga Negara Indonesia", "Warga Negara Asing"}));
		
		JButton btnSimpan = new JButton("SIMPAN");
		btnSimpan.setBounds(506, 240, 129, 101);
		panel2.add(btnSimpan);
		
		JRadioButton rdbtnLakilaki = new JRadioButton("Laki-Laki");
		rdbtnLakilaki.setBounds(134, 190, 85, 23);
		panel2.add(rdbtnLakilaki);
		buttonGroup.add(rdbtnLakilaki);
		
		JRadioButton rdbtnPerempuan = new JRadioButton("Perempuan");
		rdbtnPerempuan.setBounds(243, 190, 109, 23);
		panel2.add(rdbtnPerempuan);
		buttonGroup.add(rdbtnPerempuan);
		
		JLabel lblDesa = new JLabel("Desa");
		lblDesa.setBounds(31, 308, 46, 14);
		panel2.add(lblDesa);
		
		JLabel lblKecamatan = new JLabel("Kecamatan");
		lblKecamatan.setBounds(31, 340, 64, 14);
		panel2.add(lblKecamatan);
		
		textFieldNik = new JTextField();
		textFieldNik.setBounds(134, 48, 231, 23);
		panel2.add(textFieldNik);
		textFieldNik.setColumns(10);
		
		JButton btnPanel = new JButton("Panel 2");
		btnPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel2.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btnPanel.setBounds(662, 236, 89, 23);
		panel2.add(btnPanel);
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enumeration<AbstractButton> btn = buttonGroup.getElements();
				while(btn.hasMoreElements()){
					JRadioButton jrd = (JRadioButton) btn.nextElement();
					if(jrd.isSelected()){
						jenisKelamin = jrd.getText().toString();
						//JOptionPane.showMessageDialog(null, jenisKelamin+"\n"+comboBoxAgama.getSelectedItem().toString()+comboBoxStts.getSelectedItem().toString());
					}
				}

				datapenduduk.insertData(
						textFieldNik.getText(),
						textFieldNama.getText(),
						textFieldTmptLahir.getText(),
						textFieldTglLahir.getText(),
						jenisKelamin,
						textFieldAlamat.getText(),
						textFieldRtRw.getText(),
						textFieldDesa.getText(),
						textFieldKecamatan.getText(),
						comboBoxAgama.getSelectedItem().toString(),
						comboBoxStts.getSelectedItem().toString(),
						comboBoxPkerjaan.getSelectedItem().toString(),
						//comboBoxPkerjaan.getSelectedItem().toString()
						comboBoxKwarga.getSelectedItem().toString()
						);
				viewDataTabel();
				ClearTextField();
			}
		});
		
	}
}
