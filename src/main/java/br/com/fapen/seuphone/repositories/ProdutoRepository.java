package br.com.fapen.seuphone.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fapen.seuphone.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public Page<Produto> findByDescricaoContainingIgnoreCase(String busca, Pageable paginacao);
	
	public Page<Produto> findAllByOrderByIdProdutoAsc(Pageable paginacao);

}
