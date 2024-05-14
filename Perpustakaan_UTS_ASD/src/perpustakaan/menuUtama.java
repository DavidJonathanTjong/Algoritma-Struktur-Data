package perpustakaan;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menuUtama extends javax.swing.JFrame {

    public menuUtama() {
        initComponents();
        tampilanAwal();
        searchISBN.setEnabled(false);
    }
    private String[] bookTitle;
    private String[] authorName;
    private String[] ratingScoreX;
    private String[] isbn;
    private String[] bahasa;
    private String[] ratingTotal;
    private String[] date;
    private String[] publisher;
    DataBuku data = new DataBuku();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLibrary = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchISBN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        keyword = new javax.swing.JTextField();
        sortISBN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lihatNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelLibrary.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelLibrary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Buku", "Penulis", "Rata-rata Rating", "ISBN", "Bahasa", "Total Rating", "Tanggal Terbit", "Penerbit"
            }
        ));
        tabelLibrary.setFocusable(false);
        tabelLibrary.setRowHeight(21);
        tabelLibrary.setSelectionBackground(new java.awt.Color(255, 0, 0));
        tabelLibrary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelLibraryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelLibrary);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST BUKU PERPUSTAKAAN");

        searchISBN.setText("CARI");
        searchISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchISBNActionPerformed(evt);
            }
        });

        jLabel2.setText("Urutkan Berdasarkan ISBN (Kode Buku)");

        jLabel3.setText("Cari ISBN buku");

        sortISBN.setText("SORT");
        sortISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortISBNActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama buku");

        lihatNama.setEditable(false);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lihatNama, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sortISBN))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lihatNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchISBN)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchISBNActionPerformed
        if (keyword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Masukan isbn yang ingin dicari");
        } else {
            Searching searching = new Searching(isbn);
            int posisi = searching.cariBuku(keyword.getText());
            System.out.println("posisi ditemukan di: "+posisi);
            if (posisi == -1) {
                JOptionPane.showMessageDialog(null, "Pencarian tidak ditemukan");
            } else {
                textArea.setText("Nama buku: "+bookTitle[posisi]+"\nNama author: "
                +authorName[posisi]+"\nRata-rata rating"+ratingScoreX[posisi]
                +"\nRating Total: "+ratingTotal[posisi]+"\nPenerbit: "+publisher[posisi]
                +"\nTanggal terbit: "+date[posisi]);
            }
        }
    }//GEN-LAST:event_searchISBNActionPerformed

    private void sortISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortISBNActionPerformed
        QuickSort sort = new QuickSort(bookTitle, authorName, ratingScoreX, isbn, bahasa, ratingTotal, date, publisher);
        bookTitle = sort.getArrBookTitle();
        authorName = sort.getArrAuthorName();
        ratingScoreX = sort.getArrScoreX();
        isbn = sort.getArrNoSeri();
        bahasa = sort.getArrBahasa();
        ratingTotal = sort.getArrRatingTotal();
        date = sort.getArrDate();
        publisher = sort.getArrPenerbit();
        DefaultTableModel tmodel = (DefaultTableModel) tabelLibrary.getModel();
        tmodel.setRowCount(0);
        tampilanTabel();
        searchISBN.setEnabled(true);
    }//GEN-LAST:event_sortISBNActionPerformed

    private void tabelLibraryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelLibraryMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) tabelLibrary.getModel();
        int pil = tabelLibrary.getSelectedRow();
        lihatNama.setText((String) tmodel.getValueAt(pil, 0));
    }//GEN-LAST:event_tabelLibraryMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        menuAwal m = new menuAwal();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void tampilanAwal() {
        bookTitle = data.getArrBookTitle();
        authorName = data.getArrAuthorName();
        ratingScoreX = data.getArrScoreX();
        isbn = data.getArrNoSeri();
        bahasa = data.getArrBahasa();
        ratingTotal = data.getArrRatingTotal();
        date = data.getArrDate();
        publisher = data.getArrPenerbit();
        tampilanTabel();
    }

    public void tampilanTabel() {
        DefaultTableModel tmodel = (DefaultTableModel) tabelLibrary.getModel();
        tabelLibrary.setAutoCreateRowSorter(true);
        for (int i = 0; i < bookTitle.length; i++) {
            String judul = bookTitle[i];
            String nama = authorName[i];
            String rating = ratingScoreX[i];
            String nomor = isbn[i];
            String baha = bahasa[i];
            String totalRating = ratingTotal[i];
            String tanggal = date[i];
            String publish = publisher[i];
            ArrayList myBook = new ArrayList();
            myBook.add(judul);
            myBook.add(nama);
            myBook.add(rating);
            myBook.add(nomor);
            myBook.add(baha);
            myBook.add(totalRating);
            myBook.add(tanggal);
            myBook.add(publish);
            tmodel.addRow(myBook.toArray());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyword;
    private javax.swing.JTextField lihatNama;
    private javax.swing.JButton searchISBN;
    private javax.swing.JButton sortISBN;
    private javax.swing.JTable tabelLibrary;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
