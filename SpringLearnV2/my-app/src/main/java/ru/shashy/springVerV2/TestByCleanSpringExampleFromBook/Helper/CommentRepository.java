package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper;

import ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Model.Comment;

public interface CommentRepository {
  void sendText(Comment comment);
}