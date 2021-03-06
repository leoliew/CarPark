/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addVIPCard.java
 *
 * Created on 2012-7-21, 16:18:02
 */
package com.carpark.view;

import com.Ibiz.ICustomerBiz;
import com.Idao.ICustomerDao;
import com.biz.CustomerBiz;
import com.dao.CustomerDao;
import com.vo.Customer;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeming
 */
public class AddVIPCard extends javax.swing.JFrame {
private ICustomerDao customerDao;
    /** Creates new form addVIPCard */
    public AddVIPCard() {
        initComponents();
        setTitle("添加会员卡");
        customerDao=new CustomerDao();
        Integer  cardNo=customerDao.findMaxId()+1;
        jLabel4.setText(cardNo.toString());
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(com.carpark.view.CarParkApp.class).getContext().getResourceMap(AddVIPCard.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jTextField1.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jComboBox1.setFont(resourceMap.getFont("jComboBox1.font")); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "请选择金额", "50", "100", "200", "500", "1000", "5000" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//添加卡号按钮
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //创建一个新的客户
        Customer customer =new Customer();    
         customerDao=new CustomerDao();
        ICustomerBiz customerBiz=new CustomerBiz();
        
        //客户名称
        String cardNo= jTextField1.getText();
        //检查是否为空
        if(cardNo.trim().equalsIgnoreCase("v")||cardNo.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "卡号为空，请输入卡号", "卡号为空", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //设置卡号
        customer.setCardNo(cardNo);
        //验证卡号是否存在
        if(customerBiz.checkCustomer(customer)==false){
        customer.setCtype(1);
        //设置状态
        customer.setState(0);
        //设置当前时间
        customer.setRegisterDate(new Date(System.currentTimeMillis()));
        //设置金额
        int cash = 0;
        if(jComboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "请选择金额", "没有选择金额", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jComboBox1.getSelectedIndex()==1){
            cash=50;
        }else if(jComboBox1.getSelectedIndex()==2){
            cash=100;
        }else if(jComboBox1.getSelectedIndex()==3){
            cash=200;
        }else if(jComboBox1.getSelectedIndex()==4){
            cash=500;
        }else if(jComboBox1.getSelectedIndex()==5){
            cash=1000;
        }else if(jComboBox1.getSelectedIndex()==6){
            cash=5000;
        }
        customer.setCash(cash);        
        customerDao.saveCustomer(customer);
        JOptionPane.showMessageDialog(rootPane, "添加"+customer.getCardNo()+"会员卡成功,卡上余额"+customer.getCash()+"元","恭喜你", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        }else{
            //如果卡号在数据库中存在，则输出语句
            JOptionPane.showMessageDialog(rootPane, "你输入的卡号已存在", "卡号已存在", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddVIPCard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
