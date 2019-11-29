package com.NewsWorkFlw;

import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Content;
import com.rometools.rome.feed.rss.Item;
import com.rometools.rome.feed.rss.Source;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.feed.AbstractRssFeedView;

import com.NewsWorkFlw.Models.FeedEntry;
import com.NewsWorkFlw.Models.FeedInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component("rssFeedView")
public class MyRssFeedView extends AbstractRssFeedView {

    @Override
    protected void buildFeedMetadata(Map<String, Object> model,
                                     Channel feedChannel,
                                     HttpServletRequest request) {

        FeedInfo feedInfo = (FeedInfo) model.get("feedInfo");
        feedChannel.setTitle(feedInfo.getTitle());
        feedChannel.setLink(feedInfo.getLink());
        feedChannel.setDescription(feedInfo.getDesc());
    }

    @Override
    protected List<Item> buildFeedItems(Map<String, Object> model,
                                        HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse)
            throws Exception {

        List<Item> items = new ArrayList<>();
        FeedInfo feedInfo = (FeedInfo) model.get("feedInfo");

        for (FeedEntry feedEntry : feedInfo.getFeedEntries()) {
            Item item = new Item();
            item.setTitle(feedEntry.getTitle());
            item.setLink(feedEntry.getLink());
            item.setPubDate(feedEntry.getDate());

            Content content = new Content();
            content.setValue(feedEntry.getContent());
            item.setContent(content);
            

            items.add(item);
        }

        return items;
    }
}