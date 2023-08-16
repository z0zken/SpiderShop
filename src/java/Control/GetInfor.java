/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Control;

import Connect.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Admin_ani;
import model.Ani;
import model.User;

/**
 *
 * @author 84384
 */
public class GetInfor {

    Query getQuery = new Query();
    Connection cnn = new connect2().getConnection();

    public ArrayList<User> GetAllUser() {
        ArrayList<User> UserList = new ArrayList<>();
        try {
            String Query = getQuery.getAllUserInfor();
            Connection cnn = new connect2().getConnection();
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            System.out.println("QR4");
            while (rs.next()) {
                System.out.println("check:" + rs.getString(1));
                UserList.add(new User(rs.getString(1), rs.getDate(2) + "", rs.getNString(3) + "", rs.getString(4) + "", rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return UserList;
    }

    public double[] getPrice(String id) {
        double[] price = {0.0, 0.0, 0.0, 0.0};
        try {
            PreparedStatement ps = cnn.prepareStatement(getQuery.get_price_according_ani_id());
            ResultSet rs = ps.executeQuery();
            ps.setString(1, id);
            rs.next();
            price[0] = rs.getDouble(1);
            price[1] = rs.getDouble(2);
            price[2] = rs.getDouble(3);
            price[3] = rs.getDouble(4);
        } catch (Exception e) {
        }
        return price;
    }

    public ArrayList<String> getImgUrl(String id) {
        ArrayList<String> imgList = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(getQuery.get_link_img_according_ani_id());
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                imgList.add(rs.getString(1).trim());
            }
        } catch (Exception e) {
        }
        return imgList;
    }
    
    public ArrayList<Ani> GetAllAni(String type) {
        ArrayList<Ani> AniList = new ArrayList<>();
        try {
            String Query = getQuery.getAllAnimal(type);
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            System.out.println("QR4");
            while (rs.next()) {
//                System.out.println("check:" + rs.getString(1));
                ArrayList<String> img_url = new ArrayList<>();
                double[] price = {0.0, 0.0, 0.0, 0.0};
                Ani ani = new Ani();
                ani.setId_ani(rs.getString(1).trim());
                ani.setName_cat(rs.getString(2).trim());
                ani.setScient_name(rs.getString(3).trim());
                ani.setName_ani(rs.getString(4).trim());
                ani.setPrice(getPrice(rs.getString(1)));
                ani.setImg_url(getImgUrl(rs.getString(1)));
                AniList.add(ani);
//                System.out.println(ani.toString());
            }
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return AniList;
    }
    

    public Ani getAnimalById(String id) {
        String query = "select trim(a.id_ani), trim(c.name_cat), (trim(b.name_genus)+' '+trim(a.name_species)) as scient_name, trim(a.name_ani)\n"
                + "from dbo.Ani a\n"
                + "inner join dbo.Genus b on b.id_genus = a.id_genus\n"
                + "inner join cat c on c.id_cat = a.id_cat\n"
                + "where a.id_ani =?";
        try {

            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ani ani = new Ani();
                ani.setId_ani(rs.getString(1).trim());
                ani.setName_cat(rs.getString(2).trim());
                ani.setScient_name(rs.getString(3).trim());
                ani.setName_ani(rs.getString(4).trim());
                ani.setPrice(getPrice(rs.getString(1)));
                ani.setImg_url(getImgUrl(rs.getString(1)));
                return ani;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public String UpdateQuery(String size) {
        String query1 = "update cart\n"
                + "set num = ?\n"
                + "where id_ani= ?;";

        String query2 = "update cart\n"
                + "set num_semili_mature = ?\n"
                + "where id_ani= ?;";

        String query3 = "update cart\n"
                + "set num_mature_male = ?\n"
                + "where id_ani= ?;";

        String query4 = "update cart\n"
                + "set num_mature_female = ?\n"
                + "where id_ani= ?;";

        if (size.equalsIgnoreCase("Sling")) {
            return query1;
        }
        if (size.equalsIgnoreCase("Semi li-mature")) {
            return query2;
        }
        if (size.equalsIgnoreCase("Mature-Male")) {
            return query3;
        }
        if (size.equalsIgnoreCase("Mature-Female")) {
            return query4;
        }
        return null;
    }

    public void UpdateCart(String id_ani, int number, String size) {
        try {
            PreparedStatement ps = cnn.prepareStatement(UpdateQuery(size));
                ps.setInt(1, number);
                ps.setString(2, id_ani);
                ps.executeUpdate();
        } catch (Exception e) {

        }
    }
    
    public String getCartByIdAni(String id_ani){
        String query= "select id_ani from cart\n where id_ani =?";
        try{
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id_ani);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return rs.getString(1);
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public void AddToCart(String id_user, String id_ani, int sling, int semili, int male, int female) {
        String query = "insert cart values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id_user);
            ps.setString(2, id_ani);
            ps.setInt(3, sling);
            ps.setInt(4, semili);
            ps.setInt(5, male);
            ps.setInt(6, female);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }
    
    public ArrayList<Admin_ani> getAllAniAdmin() {
        ArrayList<Admin_ani> AniList = new ArrayList<>();
        String Query = getQuery.getAllAnimal_admin();
        try {
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs;
            rs = ps.executeQuery();
            System.out.println("admintable");
            while (rs.next()) {
//                System.out.println("check:" + rs.getString(1));
                Admin_ani ani = new Admin_ani();
                ani.setId_ani(rs.getString(1).trim());
                ani.setName_cat(rs.getString(2).trim());
                ani.setSpecies_name(rs.getString(3).trim());
                ani.setGenus(rs.getString(4).trim());
                ani.setScient_name(rs.getString(5).trim());
                ani.setName_ani(rs.getString(6).trim());
                ani.setPrice(getPrice(rs.getString(1)));
                ani.setImg_url(getImgUrl(rs.getString(1)));
                ani.setSling(rs.getInt(7));
                ani.setSemili_mature(rs.getInt(8));
                ani.setMale_mature(rs.getInt(9));
                ani.setFemale_mature(rs.getInt(10));
                ani.setPsling(rs.getInt(11));
                ani.setPsemili_mature(rs.getInt(12));
                ani.setPmale_mature(rs.getInt(13));
                ani.setPfemale_mature(rs.getInt(14));
                ani.setDetail(rs.getString(15).trim());
                AniList.add(ani);
//                System.out.println(ani.toString());
            }
            rs.close();
            ps.close();
            cnn.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return AniList;
    }
    
    public Admin_ani getAnimalById_Admin(String id) {
        String query = getQuery.getAniById_Admin();
        try {

            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Admin_ani ani = new Admin_ani();
                ani.setId_ani(rs.getString(1).trim());
                ani.setName_cat(rs.getString(2).trim());
                ani.setSpecies_name(rs.getString(3).trim());
                ani.setGenus(rs.getString(4).trim());
                ani.setScient_name(rs.getString(5).trim());
                ani.setName_ani(rs.getString(6).trim());
                ani.setPrice(getPrice(rs.getString(1)));
                ani.setImg_url(getImgUrl(rs.getString(1)));
                ani.setSling(rs.getInt(7));
                ani.setSemili_mature(rs.getInt(8));
                ani.setMale_mature(rs.getInt(9));
                ani.setFemale_mature(rs.getInt(10));
                ani.setPsling(rs.getInt(11));
                ani.setPsemili_mature(rs.getInt(12));
                ani.setPmale_mature(rs.getInt(13));
                ani.setPfemale_mature(rs.getInt(14));
                ani.setDetail(rs.getString(15).trim());
                return ani;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    public void deleteAniById_Admin(String id){
        String query = getQuery.deleteAni_Admin();
        
        try{
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void Add_Admin(String id, String species, String name, String speci_name, String gen,
            String img1, String img2, String img3, int PSling, int PSemili, int PMale,
            int PFemale, int QSling, int QSemili, int QMale, int QFemale, String detail){
        String query = getQuery.Create_Admin();
        String id_cat= null;
        if(species.equalsIgnoreCase("Spider")){
            id_cat="CAT001";
        }
        if(species.equalsIgnoreCase("Scopion")){
            id_cat="CAT004";
        }
        if(species.equalsIgnoreCase("Frog")){
            id_cat="CAT002";
        }
        try {
            PreparedStatement ps = cnn.prepareStatement(query);      
            ps.setString(1, id);
            ps.setString(2, id_cat);
            ps.setString(3, gen);
            ps.setString(4, speci_name);
            ps.setString(5, name);
            
            ps.setString(6, id);
            ps.setString(7, img1);
            ps.setInt(8, 1);
            ps.setString(9, id);
            ps.setString(10, img2);
            ps.setInt(11, 2);
            ps.setString(12, id);
            ps.setString(13, img3);
            ps.setInt(14, 3);
            
            ps.setString(15, id);
            ps.setInt(16, PSling);
            ps.setInt(17, PSemili);
            ps.setInt(18, PMale);
            ps.setInt(19, PFemale);
            
            ps.setString(20, id);
            ps.setInt(21, QSling);
            ps.setInt(22, QSemili);
            ps.setInt(23, QMale);
            ps.setInt(24, QFemale);
            
            ps.setString(25, id);
            ps.setString(26, detail);
            ps.executeQuery();
        } catch (Exception e) {
        }
        
    }
    
    public void Update_Admin(String id, String species, String name, String speci_name, String gen,
            String img1, String img2, String img3, int PSling, int PSemili, int PMale,
            int PFemale, String detail){
        String query = getQuery.UpdateAdmin();
        String id_cat= null;
        if(species.equalsIgnoreCase("Spider")){
            id_cat="CAT001";
        }
        if(species.equalsIgnoreCase("Scopion")){
            id_cat="CAT004";
        }
        if(species.equalsIgnoreCase("Frog")){
            id_cat="CAT002";
        }
        try {
            PreparedStatement ps = cnn.prepareStatement(query);      
            ps.setString(1, id_cat);
            ps.setString(2, gen);
            ps.setString(3, speci_name);
            ps.setString(4, name);            
            ps.setString(5, id);
            
            ps.setString(6, img1);
            ps.setString(7, id);
           
            ps.setString(8, img2);
            ps.setString(9, id);

            ps.setString(10, img3);
            ps.setString(11, id);
            
            ps.setInt(12, PSling);
            ps.setInt(13, PSemili);
            ps.setInt(14, PMale);
            ps.setInt(15, PFemale);
            ps.setString(16, id);
            
            ps.setString(17, detail);
            ps.setString(18, id);
            ps.executeQuery();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {

    }
}
