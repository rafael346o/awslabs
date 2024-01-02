package us.codecraft.webmagic.selector;

import org.jsoup.nodes.Element;

import java.util.List;

/**
 * Selector(extractor) for html elements.<br>
 *
 * @author code4crafter@gmail.com <br>
 * @since 0.2.2
 */
public interface ElementSelector {

    /**
     * Extract single result in text.<br>
     * If there are more than one result, only the first will be chosen.
     *
     * @param element
     * @return result
     */
    public String select(Element element);

    /**
     * Extract all results in text.<br>
     *
     * @param element
     * @return results
     */
    public List<String> selectList(Element element);

}
