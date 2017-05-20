//package grapicalinterfaces;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import javax.swing.JTable;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//import javax.swing.table.DefaultTableModel;
//
//import datas.penduduk;
//import system.InputDataPenduduk;
//
//public class FrameArrayList extends javax.swing.JFrame {
//
//	private JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JTextField textField_2;
//	private JTextField textField_3;
//	private JTextField textField_4;
//	private JTextField textField_5;
//	private JTextField textField_6;
//	private JTextField textField_7;
//	private JTextField textField_8;
//	private JTextField textField_9;
//	private JTextField textField_10;
//	private JTextField textField_11;
//	private JTextField textField_12;
//	private JTable table;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FrameArrayList window = new FrameArrayList();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	
//	DefaultTableModel modelpenduduk;
//	InputDataPenduduk datapenduduk;
//	
//	public FrameArrayList() {
//		initialize();
////		initComponents();
//		datapenduduk = new InputDataPenduduk();
//		viewDataTabel();
//	}
//	
//	public final void viewDataTabel(){
//        String [] namakolom = {"NIM", "Nama", "Tempat Lahir", "Tanggal Lahir", "Jenis Kelamin", "Alamat", "RT/RW", "Desa", "Kecamatan", "Agama", "Status", "Pekerjaan", "Kwarganegaraan"};
//        Object [] [] objekpenduduk = new Object[datapenduduk.getALL().size()] [12];
//        int i = 0;
//        for (penduduk pdd: datapenduduk.getALL()) { 
//            String arrayPenduduk[] = {
//                pdd.getNIK(),
//                pdd.getNama(), 
//                pdd.getTptLahir(),
//                pdd.getTglLahir(),
//                pdd.getJnsKelamin(), 
//                pdd.getAlamat(),
//                pdd.getRt(),
//                pdd.getDesa(), 
//                pdd.getKecamatan(),
//                pdd.getAgama(),
//                pdd.getStatus(), 
//                pdd.getPekerjaan(),
//                pdd.getKwarganegaraan()
//            };
//            objekpenduduk[i] = arrayPenduduk;
//            i++;
//        }
//        modelpenduduk = new DefaultTableModel(objekpenduduk, namakolom);
//        table.setModel(modelpenduduk);
//    }
// 
//    public void ClearTextField(){
//    	textField.setText("");
//    	textField_1.setText("");
//        textField_2.setText("");
//        textField_3.setText("");
//        textField_4.setText("");
//        textField_5.setText("");
//        textField_6.setText("");
//        textField_7.setText("");
//        textField_8.setText("");
//        textField_9.setText("");
//        textField_10.setText("");
//        textField_11.setText("");
//        textField_12.setText("");
//    }
//	
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 909, 754);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNik = new JLabel("NIK");
//		lblNik.setBounds(50, 53, 46, 14);
//		frame.getContentPane().add(lblNik);
//		
//		JLabel lblNama = new JLabel("Nama");
//		lblNama.setBounds(50, 78, 46, 14);
//		frame.getContentPane().add(lblNama);
//		
//		JLabel lblTempatLahir = new JLabel("Tempat Lahir");
//		lblTempatLahir.setBounds(50, 103, 85, 14);
//		frame.getContentPane().add(lblTempatLahir);
//		
//		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
//		lblTanggalLahir.setBounds(50, 126, 64, 14);
//		frame.getContentPane().add(lblTanggalLahir);
//		
//		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
//		lblJenisKelamin.setBounds(50, 151, 64, 14);
//		frame.getContentPane().add(lblJenisKelamin);
//		
//		JLabel lblAlamat = new JLabel("Alamat");
//		lblAlamat.setBounds(50, 176, 64, 14);
//		frame.getContentPane().add(lblAlamat);
//		
//		JLabel lblRtrw = new JLabel("RT/RW");
//		lblRtrw.setBounds(50, 201, 64, 14);
//		frame.getContentPane().add(lblRtrw);
//		
//		JLabel lblDesa = new JLabel("Desa");
//		lblDesa.setBounds(50, 226, 64, 14);
//		frame.getContentPane().add(lblDesa);
//		
//		JLabel lblKecamatan = new JLabel("Kecamatan");
//		lblKecamatan.setBounds(50, 251, 64, 14);
//		frame.getContentPane().add(lblKecamatan);
//		
//		JLabel lblAgama = new JLabel("Agama");
//		lblAgama.setBounds(50, 276, 64, 14);
//		frame.getContentPane().add(lblAgama);
//		
//		JLabel lblStatus = new JLabel("Status");
//		lblStatus.setBounds(50, 301, 64, 14);
//		frame.getContentPane().add(lblStatus);
//		
//		JLabel lblPekerjaan = new JLabel("Pekerjaan");
//		lblPekerjaan.setBounds(50, 326, 64, 14);
//		frame.getContentPane().add(lblPekerjaan);
//		
//		JLabel lblKewarganegaraan = new JLabel("Kewarganegaraan");
//		lblKewarganegaraan.setBounds(50, 351, 104, 14);
//		frame.getContentPane().add(lblKewarganegaraan);
//		
//		textField = new JTextField();
//		textField.setBounds(195, 50, 231, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		textField_1.setBounds(195, 75, 231, 20);
//		frame.getContentPane().add(textField_1);
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		textField_2.setBounds(195, 100, 231, 20);
//		frame.getContentPane().add(textField_2);
//		
//		textField_3 = new JTextField();
//		textField_3.setColumns(10);
//		textField_3.setBounds(195, 123, 231, 20);
//		frame.getContentPane().add(textField_3);
//		
//		textField_4 = new JTextField();
//		textField_4.setColumns(10);
//		textField_4.setBounds(195, 148, 231, 20);
//		frame.getContentPane().add(textField_4);
//		
//		textField_5 = new JTextField();
//		textField_5.setColumns(10);
//		textField_5.setBounds(195, 173, 231, 20);
//		frame.getContentPane().add(textField_5);
//		
//		textField_6 = new JTextField();
//		textField_6.setColumns(10);
//		textField_6.setBounds(195, 198, 231, 20);
//		frame.getContentPane().add(textField_6);
//		
//		textField_7 = new JTextField();
//		textField_7.setColumns(10);
//		textField_7.setBounds(195, 223, 231, 20);
//		frame.getContentPane().add(textField_7);
//		
//		textField_8 = new JTextField();
//		textField_8.setColumns(10);
//		textField_8.setBounds(195, 248, 231, 20);
//		frame.getContentPane().add(textField_8);
//		
//		textField_9 = new JTextField();
//		textField_9.setColumns(10);
//		textField_9.setBounds(195, 273, 231, 20);
//		frame.getContentPane().add(textField_9);
//		
//		textField_10 = new JTextField();
//		textField_10.setColumns(10);
//		textField_10.setBounds(195, 298, 231, 20);
//		frame.getContentPane().add(textField_10);
//		
//		textField_11 = new JTextField();
//		textField_11.setColumns(10);
//		textField_11.setBounds(195, 323, 231, 20);
//		frame.getContentPane().add(textField_11);
//		
//		textField_12 = new JTextField();
//		textField_12.setColumns(10);
//		textField_12.setBounds(195, 348, 231, 20);
//		frame.getContentPane().add(textField_12);
//		
//		JButton btnSimpan = new JButton("SIMPAN");
//		btnSimpan.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				datapenduduk.insertData(
//						textField.getText(),
//						textField_1.getText(),
//						textField_2.getText(),
//						textField_3.getText(),
//						textField_4.getText(),
//						textField_5.getText(),
//						textField_6.getText(),
//						textField_7.getText(),
//						textField_8.getText(),
//						textField_9.getText(),
//						textField_10.getText(),
//						textField_11.getText(),
//						textField_12.getText()
//						);
//				viewDataTabel();
//				ClearTextField();
//			}
//		});
//		btnSimpan.setBounds(100, 420, 89, 23);
//		frame.getContentPane().add(btnSimpan);
//		
//		JButton btnHapus = new JButton("HAPUS");
//		btnHapus.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				datapenduduk.deleteData(table.getSelectedRow());
//				viewDataTabel();
//			}
//		});
//		btnHapus.setBounds(275, 420, 89, 23);
//		frame.getContentPane().add(btnHapus);
//		
//		table = new JTable();
//		table.setBounds(50, 468, 793, 236);
//		frame.getContentPane().add(table);
//	}
//}
