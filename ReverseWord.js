function reverseWords(sentence) {
    let words = [];
    let word = '';
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
                word += sentence[i];
            }
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            words.push(reversedWord);
            word = '';
        } else {
            word += sentence[i];
        }
    }
    let reversedSentence = words.join(' ');

    return reversedSentence;
}

const inputSentence = "Reverse every word in this sentence";
const reversed = reverseWords(inputSentence);
console.log(reversed);