package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private fes.aragon.partenon.Autor autor = new fes.aragon.partenon.Autor();
	private fes.aragon.partenon.Editorial editorial = new fes.aragon.partenon.Editorial();
	private fes.aragon.partenon.Genero genero = new fes.aragon.partenon.Genero();
	private fes.aragon.partenon.Libro libro = new fes.aragon.partenon.Libro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Libro dialog = new Libro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Libro() {
		setBounds(100, 100, 450, 457);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblLibro = new JLabel("Libro");
		lblLibro.setBounds(195, 11, 46, 14);
		contentPanel.add(lblLibro);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 45, 46, 14);
		contentPanel.add(lblTitulo);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setBounds(10, 70, 46, 14);
		contentPanel.add(lblAutores);
		
		JLabel lblEdicion = new JLabel("Edicion");
		lblEdicion.setBounds(10, 95, 46, 14);
		contentPanel.add(lblEdicion);
		
		JLabel lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(10, 120, 46, 14);
		contentPanel.add(lblEditorial);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(10, 145, 46, 14);
		contentPanel.add(lblIsbn);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(10, 170, 46, 14);
		contentPanel.add(lblPais);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(10, 195, 46, 14);
		contentPanel.add(lblAo);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 220, 46, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblExistencia = new JLabel("Existencia");
		lblExistencia.setBounds(10, 245, 46, 14);
		contentPanel.add(lblExistencia);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 270, 46, 14);
		contentPanel.add(lblGenero);
		
		JLabel lblEbook = new JLabel("E-book");
		lblEbook.setBounds(10, 295, 46, 14);
		contentPanel.add(lblEbook);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setBounds(10, 320, 46, 14);
		contentPanel.add(lblPasta);
		
		JLabel lblLenguaje = new JLabel("Lenguaje");
		lblLenguaje.setBounds(10, 345, 46, 14);
		contentPanel.add(lblLenguaje);
		
		JButton btnAadirGenero = new JButton("A\u00F1adir genero");
		btnAadirGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Genero dialog = new Genero();
					dialog.setGenero(genero);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirGenero.setBounds(95, 266, 116, 23);
		contentPanel.add(btnAadirGenero);
		
		JButton btnAadirAutor = new JButton("A\u00F1adir autor");
		btnAadirAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Autor dialog = new Autor();
					dialog.setAutor(autor);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirAutor.setBounds(95, 66, 116, 23);
		contentPanel.add(btnAadirAutor);
		
		JButton btnAadirEditorial = new JButton("A\u00F1adir editorial");
		btnAadirEditorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Editorial dialog = new Editorial();
					dialog.setEditorial(editorial);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAadirEditorial.setBounds(95, 111, 116, 23);
		contentPanel.add(btnAadirEditorial);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						libro.setAutores(autor);
						libro.setEditorial(editorial);
						libro.setGenero(genero);
						System.out.println(libro.toString());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
