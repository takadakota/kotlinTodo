update todoList_info
set doneFlag =
  case
    when point = true then false
    else true
  end
where id = /* id */'1'