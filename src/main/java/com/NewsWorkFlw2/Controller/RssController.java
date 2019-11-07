package com.NewsWorkFlw2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NewsWorkFlw2.Models.FeedEntry;
import com.NewsWorkFlw2.Models.FeedInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class RssController {

  @GetMapping("/main")
  public String mainView() {
      return "main";
  }

  @GetMapping("/rssFeed")
  public String handleForexRequest(Model model) {
      model.addAttribute("feedInfo", getFeedInfo());
      return "rssFeedView";
  }

  private static FeedInfo getFeedInfo() {
      //to-do: move it to service layer
      FeedInfo feedInfo = new FeedInfo();
      feedInfo.setTitle("Logicbig Tutorials");
      feedInfo.setLink("http://www.logicbig.com");
      feedInfo.setDesc("Logicbig tutorials feed");

      List<FeedEntry> list = new ArrayList<>();
      list.add(createFeedEntry("Spring Framework", "spring-framework",
              "Spring Framework Tutorials", new Date()));
      list.add(createFeedEntry("Java EE", "java-ee-tutorial",
              "Java EE Tutorials", new Date()));
      list.add(createFeedEntry("Java Core", "/core-java-tutorial/",
              "Core Java Tutorials", new Date()));
      feedInfo.setFeedEntries(list);
      return feedInfo;
  }

  private static FeedEntry createFeedEntry(String title, String uri,
                                           String content, Date date) {
      FeedEntry fe = new FeedEntry();
      fe.setTitle(title);
      fe.setLink("http://www.logicbig.com/tutorials/" + uri);
      fe.setContent(content);
      fe.setDate(date);
      return fe;
  }
}