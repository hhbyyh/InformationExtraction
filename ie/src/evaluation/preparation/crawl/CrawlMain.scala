package evaluation.preparation.crawl

import evaluation.EvalPaths

/**
  * Created by xianyan on 16-7-25.
  */
object CrawlMain {

  def main(args: Array[String]): Unit = {
    val crawler = new Crawler()
    val urlMap = EvalPaths.urlMap()
    while (true) {
      for ((label, urlStr) <- urlMap) {
        val urls = urlStr.split("\t")
        var i = 0;
        for (url <- urls) {
          crawler.crawlAndSave(url, label, i)
          i += 1
        }
      }
    }
  }
}

