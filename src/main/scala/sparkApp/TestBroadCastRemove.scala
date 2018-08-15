package sparkApp

import org.apache.spark.{SparkConf, SparkContext}

object TestBroadCastRemove {
  def main(args: Array[String]): Unit = {
    require(args.length>=4,println(" parameters usage: master, appName, input, output"))
    val conf = new SparkConf().setMaster(args(0)).setAppName(args(1))
    val sc = new SparkContext(conf)
    val rdd1 = sc.textFile(args(2))



  }

}
