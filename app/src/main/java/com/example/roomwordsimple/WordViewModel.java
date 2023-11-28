package com.example.roomwordsimple;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.roomwordsimple.data.WordRepository;
import com.example.roomwordsimple.model.Word;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private final WordRepository mRepository;

    private final LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }
}