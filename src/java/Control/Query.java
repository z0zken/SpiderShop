/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Control;

/**
 *
 * @author 84384
 */
public class Query {

    public String getAllAnimal(String type) {
        String typeID = "";
//        switch (type) {
//            case "Spider":
//                typeID = "CAT001";
//                break;
//            case "Frog":
//                typeID = "CAT002";
//                break;
//            case "Snake":
//                typeID = "CAT003";
//                break;
//            case "Sscopion":
//                typeID = "CAT004";
//                break;
//            default:
//                throw new AssertionError();
//        }
        return "select trim(a.id_ani), trim(c.name_cat), (trim(b.name_genus)+' '+trim(a.name_species)) as scient_name, trim(a.name_ani)\n"
                + "from dbo.Ani a\n"
                + "inner join dbo.Genus b on b.id_genus = a.id_genus\n"
                + "inner join cat c on c.id_cat = a.id_cat";
    }

    public String get_price_according_ani_id() {
        return "select sling, semili_mature, mature_male, mature_female\n"
                + "from dbo.Prices \n"
                + "where id_ani=?";
    }

    public String get_link_img_according_ani_id() {
        return "select img.img_link\n"
                + "from dbo.Ani inner join dbo.img on img.id_ani = Ani.id_ani\n"
                + "where dbo.Ani.id_ani= ?";
    }

    public String getAllUserInfor() {
        return "select * from dbo.customer";
    }

    public String getAllAnimal_admin() {
        return "select trim(a.id_ani), trim(c.name_cat),trim(a.name_species),trim(b.id_genus), (trim(b.name_genus)+' '+trim(a.name_species)) as scient_name, trim(a.name_ani), d.num_sling,\n"
                + "                  d.num_semili_mature, d.num_mature_male, d.num_mature_female,e.sling, e.semili_mature, e.mature_male, e.mature_female, f.ani_detail\n"
                + "                 from dbo.Ani a\n"
                + "                inner join dbo.Genus b on b.id_genus = a.id_genus\n"
                + "                inner join cat c on c.id_cat = a.id_cat\n"
                + "                inner join dbo.warehouse d on d.id_ani = a.id_ani\n"
                + "inner join dbo.Prices e on e.id_ani = a.id_ani\n"
                + "inner join dbo.text_detail f on f.id_ani = a.id_ani\n";
    }

    public String getAniById_Admin() {
        return "select trim(a.id_ani), trim(c.name_cat),trim(a.name_species),trim(b.id_genus), (trim(b.name_genus)+' '+trim(a.name_species)) as scient_name, trim(a.name_ani), d.num_sling,\n"
                + "                  d.num_semili_mature, d.num_mature_male, d.num_mature_female,e.sling, e.semili_mature, e.mature_male, e.mature_female, f.ani_detail\n"
                + "                 from dbo.Ani a\n"
                + "                inner join dbo.Genus b on b.id_genus = a.id_genus\n"
                + "                inner join cat c on c.id_cat = a.id_cat\n"
                + "                inner join dbo.warehouse d on d.id_ani = a.id_ani\n"
                + "inner join dbo.Prices e on e.id_ani = a.id_ani\n"
                + "inner join dbo.text_detail f on f.id_ani = a.id_ani\n"
                + "where a.id_ani=?";
    }

    public String deleteAni_Admin() {
        return "delete from Ani\n"
                + "where id_ani = ?";
    }

    public String Create_Admin() {
        return "BEGIN TRANSACTION;\n"
                + "\n"
                + "insert into Ani\n"
                + "values(?,?,?,?,?)\n"
                + "\n"
                + "insert into img\n"
                + "values(?,?,?),\n"
                + "(?,?,?),\n"
                + "(?,?,?)\n"
                + "\n"
                + "insert into Prices\n"
                + "values(?,?,?,?,?)\n"
                + "\n"
                + "insert into warehouse\n"
                + "values(?,?,?,?,?)\n"
                + "\n"
                + "insert into text_detail\n"
                + "values(?,?)\n"
                + "\n"
                + "COMMIT;";
    }

    public String UpdateAdmin() {
        return "BEGIN TRANSACTION;\n"
                + "\n"
                + "update Ani\n"
                + "set id_cat=?, id_genus=?, name_species=?, name_ani=?\n"
                + "where id_ani = ?\n"
                + "\n"
                + "\n"
                + "update img\n"
                + "set img_link = ?\n"
                + "where id_ani = ? and stt = 1\n"
                + "\n"
                + "update img\n"
                + "set img_link = ?\n"
                + "where id_ani = ? and stt = 2\n"
                + "\n"
                + "update img\n"
                + "set img_link = ?\n"
                + "where id_ani = ? and stt = 3\n"
                + "\n"
                + "update Prices\n"
                + "set sling =?, semili_mature=?, mature_male=?, mature_female=?\n"
                + "where id_ani=?\n"
                + "\n"
                + "UPDATE text_detail\n"
                + "set ani_detail=?\n"
                + "where id_ani=?\n"
                + "\n"
                + "COMMIT;";
    }

}
