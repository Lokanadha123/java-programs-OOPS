package encapsulation;
class employee {
    private String emp_name;
    private int emp_id;
    private String emp_dept;

    public String getEmp_name() {
        return emp_name;
    }

        public void setemp_name (String name){
            emp_name = name;
        }
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int id){
        emp_id=id;
    }
    public String getEmp_dept() {
        return emp_dept;
    }
        public void setemp_dept( String dept){
            emp_dept = dept;
        }
    }
class encap1 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setemp_name("vicky");
        e1.setemp_dept("testing");
        e1.setEmp_id(1);
        System.out.println("name is"+ e1.getEmp_name());
        System.out.println("id"+ e1.getEmp_id());
        System.out.println("dept"+ e1.getEmp_dept());
    }
}