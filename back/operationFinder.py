from sklearn import svm
from datas import Datas

class OperationFinder:

    def __init__(self, nlp):
        self.nlp = nlp

    def opertationalfinder(self, st):

        dt = Datas()
        train_x = dt.get_train_x()
        train_y = dt.get_train_y()

        docs = [self.nlp(txt) for txt in train_x]
        train_x_word_vector = [x.vector for x in docs]

        clf_svm_wv = svm.SVC(kernel='linear')
        clf_svm_wv.fit(train_x_word_vector, train_y)



        test_x = [st]
        test_docs = [self.nlp(txt) for txt in test_x]
        test_x_word_vector = [x.vector for x in test_docs]


        return clf_svm_wv.predict(test_x_word_vector)[0]