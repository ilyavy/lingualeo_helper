package jila.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Book parser, which analyzes the sentences of a book sequentially, sentence by sentence.
 */
public class SimpleSequentialBookTextParser extends BookTextParser {

	@Override
	public Map<String, Word> countWords(final List<String> sentences) {
		Map<String, Word> wordsMap = new HashMap<>();

		for (String sentence : sentences) {
			parseSentence(sentence, wordsMap);
		}

		return wordsMap;
	}
}