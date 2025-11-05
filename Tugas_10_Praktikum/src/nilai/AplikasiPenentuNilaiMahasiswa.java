package nilai;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class AplikasiPenentuNilaiMahasiswa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNamaLengkap;
	private JTextField txtTugasMurni;
	private JTextField txtNilaiUTS;
	private JTextField txtNilaiUAS;
	private JLabel lblOutputNama;
	private JLabel lblOutputRataRata;
	private JLabel lblOutputGrade;
	private JLabel lblOutputHasil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikasiPenentuNilaiMahasiswa frame = new AplikasiPenentuNilaiMahasiswa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AplikasiPenentuNilaiMahasiswa() {
		initialize();
	}
	
	private void initialize() {
		setTitle("Aplikasi Penentu Nilai Mahasiswa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelNama = new JPanel();
		panelNama.setBackground(new Color(255, 153, 153));
		panelNama.setBounds(10, 11, 544, 58);
		contentPane.add(panelNama);
		panelNama.setLayout(null);
		
		JLabel lblNamaLengkap = new JLabel("Nama Lengkap");
		lblNamaLengkap.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNamaLengkap.setBounds(23, 19, 100, 20);
		panelNama.add(lblNamaLengkap);
		
		txtNamaLengkap = new JTextField();
		txtNamaLengkap.setBounds(133, 19, 280, 20);
		panelNama.add(txtNamaLengkap);
		txtNamaLengkap.setColumns(10);
		
		JPanel panelNilai = new JPanel();
		panelNilai.setBackground(new Color(153, 255, 153));
		panelNilai.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nilai", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelNilai.setBounds(10, 80, 264, 160);
		contentPane.add(panelNilai);
		panelNilai.setLayout(null);
		
		JLabel lblTugasMurni = new JLabel("Tugas Murni");
		lblTugasMurni.setBounds(20, 30, 80, 20);
		panelNilai.add(lblTugasMurni);
		
		txtTugasMurni = new JTextField();
		txtTugasMurni.setBounds(110, 30, 120, 20);
		panelNilai.add(txtTugasMurni);
		txtTugasMurni.setColumns(10);
		
		JLabel lblNilaiUTS = new JLabel("Nilai UTS");
		lblNilaiUTS.setBounds(20, 70, 80, 20);
		panelNilai.add(lblNilaiUTS);
		
		txtNilaiUTS = new JTextField();
		txtNilaiUTS.setColumns(10);
		txtNilaiUTS.setBounds(110, 70, 120, 20);
		panelNilai.add(txtNilaiUTS);
		
		JLabel lblNilaiUAS = new JLabel("Nilai UAS");
		lblNilaiUAS.setBounds(20, 110, 80, 20);
		panelNilai.add(lblNilaiUAS);
		
		txtNilaiUAS = new JTextField();
		txtNilaiUAS.setColumns(10);
		txtNilaiUAS.setBounds(110, 110, 120, 20);
		panelNilai.add(txtNilaiUAS);
		
		JPanel panelHasil = new JPanel();
		panelHasil.setBackground(new Color(255, 255, 153));
		panelHasil.setBorder(new TitledBorder(null, "Hasil", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelHasil.setBounds(290, 80, 264, 160);
		contentPane.add(panelHasil);
		panelHasil.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(20, 30, 100, 14);
		panelHasil.add(lblNama);
		
		JLabel lblNilaiRataRata = new JLabel("Nilai Rata-rata");
		lblNilaiRataRata.setBounds(20, 55, 100, 14);
		panelHasil.add(lblNilaiRataRata);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setBounds(20, 80, 100, 14);
		panelHasil.add(lblGrade);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setBounds(20, 105, 100, 14);
		panelHasil.add(lblHasil);
		
		lblOutputNama = new JLabel("nama");
		lblOutputNama.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputNama.setBounds(130, 30, 124, 14);
		panelHasil.add(lblOutputNama);
		
		lblOutputRataRata = new JLabel("rata");
		lblOutputRataRata.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputRataRata.setBounds(130, 55, 124, 14);
		panelHasil.add(lblOutputRataRata);
		
		lblOutputGrade = new JLabel("grade");
		lblOutputGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputGrade.setBounds(130, 80, 124, 14);
		panelHasil.add(lblOutputGrade);
		
		lblOutputHasil = new JLabel("hasil");
		lblOutputHasil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputHasil.setBounds(130, 105, 124, 14);
		panelHasil.add(lblOutputHasil);
		
		JPanel panelTombol = new JPanel();
		panelTombol.setBackground(new Color(153, 204, 255));
		panelTombol.setBounds(10, 251, 544, 119);
		contentPane.add(panelTombol);
		panelTombol.setLayout(null);
		
		JButton btnHitung = new JButton("Hitung");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hitungNilai();
			}
		});
		btnHitung.setBounds(40, 45, 100, 30);
		panelTombol.add(btnHitung);
		
		JButton btnBersihkan = new JButton("Bersihkan");
		btnBersihkan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bersihkanForm();
			}
		});
		btnBersihkan.setBounds(160, 45, 100, 30);
		panelTombol.add(btnBersihkan);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				simpanKeFile();
			}
		});
		btnSimpan.setBounds(280, 45, 100, 30);
		panelTombol.add(btnSimpan);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(
					null, 
					"Apakah Anda yakin ingin keluar?", 
					"Konfirmasi Keluar", 
					JOptionPane.YES_NO_OPTION
				);
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnKeluar.setBounds(400, 45, 100, 30);
		panelTombol.add(btnKeluar);
	}
	
	private void hitungNilai() {
        if (txtNamaLengkap.getText().isEmpty() || txtTugasMurni.getText().isEmpty() || 
            txtNilaiUTS.getText().isEmpty() || txtNilaiUAS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double tugas = Double.parseDouble(txtTugasMurni.getText());
            double uts = Double.parseDouble(txtNilaiUTS.getText());
            double uas = Double.parseDouble(txtNilaiUAS.getText());
            double rataRata = (tugas + uts + uas) / 3;
            String grade;
            String hasil;

            if (rataRata >= 85) {
                grade = "A";
            } else if (rataRata >= 80) {
                grade = "A-";
            } else if (rataRata >= 75) {
                grade = "B+";
            } else if (rataRata >= 70) {
                grade = "B";
            } else if (rataRata >= 65) {
                grade = "B-";
            } else if (rataRata >= 60) {
                grade = "C+";
            } else if (rataRata >= 50) {
                grade = "C";
            } else if (rataRata >= 40) {
                grade = "D";
            } else {
                grade = "E";
            }

            if (grade.equals("D") || grade.equals("E")) {
                hasil = "Tidak Lulus";
            } else {
                hasil = "Lulus";
            }

            lblOutputNama.setText(txtNamaLengkap.getText());
            lblOutputRataRata.setText(String.format("%.2f", rataRata));
            lblOutputGrade.setText(grade);
            lblOutputHasil.setText(hasil);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input nilai harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	private void bersihkanForm() {
        txtNamaLengkap.setText("");
        txtTugasMurni.setText("");
        txtNilaiUTS.setText("");
        txtNilaiUAS.setText("");
        lblOutputNama.setText("nama");
        lblOutputRataRata.setText("rata");
        lblOutputGrade.setText("grade");
        lblOutputHasil.setText("hasil");
        txtNamaLengkap.requestFocus();
    }
	
	private void simpanKeFile() {
        if (lblOutputNama.getText().equals("nama") || lblOutputNama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada data untuk disimpan. Silakan hitung terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hasil_nilai.txt", true))) {
            writer.write("=====================================");
            writer.newLine();
            writer.write("Nama           : " + lblOutputNama.getText());
            writer.newLine();
            writer.write("Nilai Rata-rata: " + lblOutputRataRata.getText());
            writer.newLine();
            writer.write("Grade          : " + lblOutputGrade.getText());
            writer.newLine();
            writer.write("Hasil          : " + lblOutputHasil.getText());
            writer.newLine();
            writer.write("=====================================");
            writer.newLine();
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file hasil_nilai.txt", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi error saat menyimpan file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}