/*


package org.example.Demo.Sbclass

import org.apache.spark.sql.SparkSession

object Left_Anti_Join {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("leftantijoin").getOrCreate()
    import spark.sqlContext.implicits._
    val emp = Seq((1,"Smith",-1,"2018","10","M",3000),
      (2,"Rose",1,"2010","20","M",4000),
      (3,"Williams",1,"2010","10","M",1000),
      (4,"Jones",2,"2005","10","F",2000),
      (5,"Brown",2,"2010","40","",-1),
      (6,"Brown",2,"2010","50","",-1))
    val columns = Seq("emp_id","name","superior_emp_id","year_joined",
      "emp_dept_id","gender","salary")
    val empdf = emp.toDF(columns:_*)
    empdf.show()

    val dept = Seq(("Finance",10),
      ("Marketing",20),
      ("Sales",30),
      ("IT",40)
    )

    val deptColumns = Seq("dept_name","dept_id")
    val deptdF = dept.toDF(deptColumns:_*)
    deptdF.show(false)

    //left anti join
    empdf.join(deptdF,empdf("emp_dept_id") === deptdF("dept_id"),"left_anti").show()

    //left semi join
    empdf.join(deptdF,empdf("emp_dept_id") === deptdF("dept_id"),"left_semi").show()
  }

}


*/
