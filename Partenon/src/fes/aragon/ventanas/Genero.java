package fes.aragon.ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Genero extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ArrayList<fes.aragon.partenon.Ubicacion> ubicaciones= new ArrayList<>();
	private fes.aragon.partenon.Genero genero = null;
	private JComboBox comboBox1 = new JComboBox();
	private JComboBox comboBox2 = new JComboBox();

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Genero dialog = new Genero();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Genero() {
		setBounds(100, 100, 450, 385);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblGenero = new JLabel("Genero");
			lblGenero.setFont(new Font("Fira Code Retina", Font.PLAIN, 11));
			lblGenero.setBounds(188, 11, 46, 14);
			contentPanel.add(lblGenero);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 65, 46, 14);
			contentPanel.add(lblNombre);
		}
		{
			/*comboBox1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					System.out.println(comboBox1.getSelectedItem());
					comboBox2.setSelectedIndex(comboBox1.getSelectedIndex());
				}
			});*/
			comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Selecciona una opcion", "Fisica", "Matematicas", "Programacion", "Desarrollo Web", "Machine Learning", "Big Data"}));
			comboBox1.setBounds(82, 62, 146, 20);
			contentPanel.add(comboBox1);
		}
		{
			JLabel lblNumeroDeGenero = new JLabel("Numero de genero");
			lblNumeroDeGenero.setBounds(10, 136, 46, 14);
			contentPanel.add(lblNumeroDeGenero);
		}
		{
			comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion", "1", "2", "3", "4", "5", "6"}));
			comboBox2.setBounds(82, 133, 152, 20);
			contentPanel.add(comboBox2);
		}
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(10, 185, 46, 14);
		contentPanel.add(lblUbicacion);
		
		JButton btnAbrirUbicacion = new JButton("Abrir ubicacion");
		btnAbrirUbicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ubicacion dialog = new Ubicacion();
					dialog.setUbicacion(ubicaciones);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnAbrirUbicacion.setBounds(83, 181, 130, 23);
		contentPanel.add(btnAbrirUbicacion);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						genero.setNombre((String)comboBox1.getSelectedItem());
						genero.setNumeroGenero(Integer.parseInt((String)comboBox2.getSelectedItem()));
						genero.setUbicacion(ubicaciones);
						System.out.println(genero.toString());
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
		
		/*if (genero != null) {
			if (genero.getNombre().equals("")) {
				this.comboBox1.setSelectedItem(genero.getNombre());
			}
		}*/
		
	}

	
	
	public fes.aragon.partenon.Genero getGenero() {
		return genero;
	}

	public void setGenero(fes.aragon.partenon.Genero genero) {
		this.genero = genero;
	}

	public fes.aragon.partenon.Ubicacion getUbicacion() {
		return ubicaciones;
	}

	public void setUbicacion(fes.aragon.partenon.Ubicacion ubicacion) {
		this.ubicaciones = ubicacion;
	}

	
}
