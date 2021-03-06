/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;


import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Font;
import static com.itextpdf.kernel.pdf.PdfName.FontFamily;


import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.layout.element.Text;
//import com.sun.javafx.geom.Rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import sun.text.normalizer.RangeValueIterator.Element;


/*
 *
 * @author Jacob Salomon Saaavedra Morales
 */
public class IngresarVehiculo extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresarVehiculo
     */
    public IngresarVehiculo() {
        initComponents();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        tfPropietario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbMoto = new javax.swing.JRadioButton();
        rbAuto = new javax.swing.JRadioButton();
        button1 = new java.awt.Button();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Panel de Ingreso de vehiculos al parqueadero");

        tfPlaca.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N

        tfPropietario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N

        jLabel2.setText("Placa del Veh??culo");

        jLabel3.setText("Nombre de Propietario");

        jLabel4.setText("Tipo de vehiculo");

        buttonGroup1.add(rbMoto);
        rbMoto.setText("Moto");
        rbMoto.setToolTipText("");

        buttonGroup1.add(rbAuto);
        rbAuto.setText("Automovil");

        button1.setBackground(new java.awt.Color(255, 102, 0));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Registrar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(rbAuto)
                                .addGap(60, 60, 60)
                                .addComponent(rbMoto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel4)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAuto)
                    .addComponent(rbMoto))
                .addGap(42, 42, 42)
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    String fechaHora = "";
     public static final String DEST = "ProyectoParqueadero/hello_world.pdf";
     
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        String clasevehiculo = "";
        if (rbAuto.isSelected()) {
            clasevehiculo = "Automovil";
        }
        if (rbMoto.isSelected()) {
            clasevehiculo = "Motocicleta";
        }

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdparqueadero", "root", "");
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            fechaHora = dateFormat.format(date);
            System.out.print(dateFormat.format(date));
            Statement stat = conexion.createStatement();
            String sql = "INSERT INTO facturas (Placa, NombrePropietario,TipoVehiculo,FechaHoraEntrada,Disponibilidad) VALUES ('" + tfPlaca.getText() + "','" + tfPropietario.getText() + "','" + clasevehiculo + "','" + fechaHora + "','Disponible')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "El vehiculo se registro exitosamente");

        } catch (SQLException ex) {
            Logger.getLogger(IngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
      /**    String dest = "C:/reportes/sample.pdf"; 
        try {
            
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc, PageSize.A5);
            pdfDoc.addNewPage(); 
           
            Paragraph para = new Paragraph ("Recibo Parqueadero"); 
            
            para.setBorder(Border.NO_BORDER);
            para.setBold();
             
            Paragraph para1 = new Paragraph ("Placa vehiculo: "+tfPlaca.getText()); 
            Paragraph para2 = new Paragraph ("Nombre del propietario: "+tfPropietario.getText()); 
            Paragraph para3 = new Paragraph ("Hora de ingreso: "+fechaHora); 
            
            document.add(para); 
            document.add(para1); 
            document.add(para2); 
            document.add(para3); 
            document.close();
             System.out.println("PDF Created");  
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
       // } catch (IOException ex) {
            //Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {

		if ((new File("c:\\reportes/sample.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\reportes/sample.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
           

        
      /**    String dest = "C:/reportes/sample.pdf"; 
        try {
            
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc, PageSize.A5);
            pdfDoc.addNewPage(); 
           
            Paragraph para = new Paragraph ("Recibo Parqueadero"); 
            
            para.setBorder(Border.NO_BORDER);
            para.setBold();
             
            Paragraph para1 = new Paragraph ("Placa vehiculo: "+tfPlaca.getText()); 
            Paragraph para2 = new Paragraph ("Nombre del propietario: "+tfPropietario.getText()); 
            Paragraph para3 = new Paragraph ("Hora de ingreso: "+fechaHora); 
            
            document.add(para); 
            document.add(para1); 
            document.add(para2); 
            document.add(para3); 
            document.close();
             System.out.println("PDF Created");  
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
       // } catch (IOException ex) {
            //Logger.getLogger(PanelIngresarVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {

		if ((new File("c:\\reportes/sample.pdf")).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("rundll32 url.dll,FileProtocolHandler c:\\reportes/sample.pdf");
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");

		}

		System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }
           
            **/

        
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbAuto;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
