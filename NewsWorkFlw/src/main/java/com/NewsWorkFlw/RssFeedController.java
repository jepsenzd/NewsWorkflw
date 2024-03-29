package com.NewsWorkFlw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.NewsWorkFlw.Models.FeedEntry;
import com.NewsWorkFlw.Models.FeedInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RssFeedController {

    @GetMapping("/")
    public String mainView() {
        return "main";
    }

    @RequestMapping(value = "/rssFeed", method = RequestMethod.GET, params = {"action=company"})
    public String companyFeed(Model model) {
        model.addAttribute("feedInfo", getFeedCompanyInfo());
        return "rssFeedView";
    }
    
    @RequestMapping(value = "/rssFeed", method = RequestMethod.GET, params = {"action=events"})
    public String eventFeed(Model model) {
        model.addAttribute("feedInfo", getFeedEventInfo());
        return "rssFeedView";
    }
    
    @RequestMapping(value = "/rssFeed", method = RequestMethod.GET, params = {"action=career"})
    public String careerFeed(Model model) {
        model.addAttribute("feedInfo", getFeedCareerInfo());
        return "rssFeedView";
    }

    private static FeedInfo getFeedCompanyInfo() {
        //to-do: move it to service layer
        FeedInfo feedInfo = new FeedInfo();
        feedInfo.setTitle("Company");
        feedInfo.setLink("http://www.ourCompany.com/about");
        feedInfo.setDesc("Company RSS info");

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
    
    private static FeedInfo getFeedCareerInfo() {
        //to-do: move it to service layer
        FeedInfo feedInfo = new FeedInfo();
        feedInfo.setTitle("Careers");
        feedInfo.setLink("http://www.ourCompany.com/careers");
        feedInfo.setDesc("Company careers info");

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
    
    private static FeedInfo getFeedEventInfo() {
        //to-do: move it to service layer
        FeedInfo feedInfo = new FeedInfo();
        feedInfo.setTitle("Events");
        feedInfo.setLink("http://www.ourCompany.com/events");
        feedInfo.setDesc("Company event info");

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

    /**
     * 
     * @param title
     * @param uri
     * @param content
     * @param date
     * @return fe (feed entry containing (title, link, content, and date))
     */
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